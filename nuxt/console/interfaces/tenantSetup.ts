declare module "vue/types/tenantSetup" {
    interface TenantTemplate {
        tenantUUID : string,
        dcBalanceStop : bigint,
        freeTenantDc : bigint,
        dcPer24BMessage : bigint,
        dcPer24BDownlink : bigint,
        dcPer24BDuplicate : bigint,
        dcPerDeviceInserted : bigint,
        inactivityBillingPeriodMs : bigint,
        dcPerInactivityPeriod : bigint,
        activityBillingPeriodMs : bigint,
        dcPerActivityPeriod : bigint,
        maxDcPerDevice: bigint,
        limitDcRatePeriodMs: bigint,
        limitDcRatePerDevice : bigint,
        dcPrice : number,
        dcMin : bigint,
        maxOwnedTenants : bigint,
        maxDevices : bigint,
        signupAllowed : boolean
        id : string
    }
}