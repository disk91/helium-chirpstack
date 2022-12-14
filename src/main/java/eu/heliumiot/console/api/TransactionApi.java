package eu.heliumiot.console.api;


import eu.heliumiot.console.api.interfaces.*;
import eu.heliumiot.console.service.HeliumTenantService;
import eu.heliumiot.console.service.HeliumTenantSetupService;
import eu.heliumiot.console.service.TransactionService;
import fr.ingeniousthings.tools.ITParseException;
import fr.ingeniousthings.tools.ITRightException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@Tag( name = "transaction api", description = "transaction management api" )
@CrossOrigin
@RequestMapping(value = "/console/1.0/transaction")
@RestController
public class TransactionApi {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected TransactionService transactionService;


    @Operation(summary = "Create a stripe transaction intent",
            description = "Create a Stripe transaction intent for a customer order",
            responses = {
                    @ApiResponse(responseCode = "200", description= "Done", content = @Content(schema =@Schema(implementation = TransactionStripeReqItf.class))),
                    @ApiResponse(responseCode = "400", description= "Bad Request", content = @Content(schema = @Schema(implementation = ActionResult.class))),
                    @ApiResponse(responseCode = "403", description= "Forbidden", content = @Content(schema = @Schema(implementation = ActionResult.class))),
            }
    )
    @RequestMapping(value="/intent",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method= RequestMethod.POST)
    @PreAuthorize("hasAnyRole('ROLE_USER')")
    public ResponseEntity<?> requestTransactionIntentCreation(
            HttpServletRequest request,
            @RequestBody(required = true) TransactionStripeReqItf txReq
    ) {
        log.debug("Create transaction for "+request.getUserPrincipal().getName());
        try {
            TransactionStripeRespItf r = transactionService.initStripeTransaction(
                    request.getUserPrincipal().getName(),
                    request.getHeader("x-real-ip"),
                    txReq
            );
            return new ResponseEntity<>(r, HttpStatus.OK);
        } catch ( ITRightException x ) {
            ActionResult a = ActionResult.FORBIDDEN();
            a.setMessage(x.getMessage());
            return new ResponseEntity<>(a, HttpStatus.FORBIDDEN);
        } catch ( ITParseException x ) {
            ActionResult a = ActionResult.BADREQUEST();
            a.setMessage(x.getMessage());
            return new ResponseEntity<>(a, HttpStatus.BAD_REQUEST);
        }

    }

    @Operation(summary = "Request Update on a stripe transaction intent",
            description = "Force to update the stripe transcation intent, it's managed in background also",
            responses = {
                    @ApiResponse(responseCode = "200", description= "Done", content = @Content(schema =@Schema(implementation = ActionResult.class))),
                    @ApiResponse(responseCode = "403", description= "Forbidden", content = @Content(schema = @Schema(implementation = ActionResult.class))),
            }
    )
    @RequestMapping(value="/intent/{txUUID}/",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method= RequestMethod.PUT)
    @PreAuthorize("hasAnyRole('ROLE_USER')")
    public ResponseEntity<?> updateTransactionIntentCreation(
            HttpServletRequest request,
            @Parameter(required = true, name = "txUUID", description = "transaction Id")
            @PathVariable String txUUID
    ) {
        log.debug("Refresh transaction for "+request.getUserPrincipal().getName());
        try {
            transactionService.updateStripeTransaction(
                    request.getUserPrincipal().getName(),
                    txUUID
            );
            return new ResponseEntity<>(ActionResult.SUCESS(), HttpStatus.OK);
        } catch ( ITRightException x ) {
            ActionResult a = ActionResult.FORBIDDEN();
            a.setMessage(x.getMessage());
            return new ResponseEntity<>(a, HttpStatus.FORBIDDEN);
        }
    }


    // ----

    @Operation(summary = "Get transaction list",
            description = "Get the list of transaction for a given user, empty list when none, sort by creation date",
            responses = {
                    @ApiResponse(responseCode = "200", description= "Done",
                            content = @Content(array = @ArraySchema(schema = @Schema( implementation = TransactionListRespItf.class)))),
                    @ApiResponse(responseCode = "403", description= "Forbidden", content = @Content(schema = @Schema(implementation = ActionResult.class))),
            }
    )
    @RequestMapping(value="/",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method= RequestMethod.GET)
    @PreAuthorize("hasAnyRole('ROLE_USER')")
    public ResponseEntity<?> requestUserTransactionList(
            HttpServletRequest request
    ) {
        log.debug("Get transaction list for "+request.getUserPrincipal().getName());
        List<TransactionListRespItf> r = transactionService.getTransactionHistory(request.getUserPrincipal().getName());
        return new ResponseEntity<>(r, HttpStatus.OK);
    }



}
