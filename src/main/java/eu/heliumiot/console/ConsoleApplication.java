/*
 * Copyright (c) - Paul Pinault (aka disk91) - 2020.
 *
 *    Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 *    and associated documentation files (the "Software"), to deal in the Software without restriction,
 *    including without limitation the rights to use, copy, modify, merge, publish, distribute,
 *    sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 *    furnished to do so, subject to the following conditions:
 *
 *    The above copyright notice and this permission notice shall be included in all copies or
 *    substantial portions of the Software.
 *
 *    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 *    FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 *    OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 *    WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR
 *    IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package eu.heliumiot.console;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.redis.core.RedisKeyValueAdapter;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableScheduling
@EnableWebMvc
@Configuration
@SpringBootApplication
@EnableJpaRepositories(basePackages = "eu.heliumiot.console.jpa")
@EnableRedisRepositories(basePackages = "eu.heliumiot.console.redis", enableKeyspaceEvents = RedisKeyValueAdapter.EnableKeyspaceEvents.ON_STARTUP)
public class ConsoleApplication implements CommandLineRunner, ExitCodeGenerator {

	public static boolean requestingExitForStartupFailure = false;

	public static ApplicationContext context;

	public static void main(String[] args) {
		context = SpringApplication.run(ConsoleApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		long pid = ProcessHandle.current().pid();
		System.out.println("-------------- GO ("+pid+")--------------");

		if (ConsoleApplication.requestingExitForStartupFailure) exit();


	}

	public static void exit() {
		int exitCode = SpringApplication.exit(context,new ExitCodeGenerator() {
			@Override
			public int getExitCode() {
				return 0;
			}
		});
		// Bug in springboot, calling exit is create a deadlock
		//System.exit(exitCode);
		System.out.println("------------- GONE --------------");
	}

	public int getExitCode() {
		return 0;
	}
}
