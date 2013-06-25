/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.apache.airavata.jobsubmission.gram;

import org.apache.airavata.jobsubmission.gram.notifier.GramJobLogger;
import org.junit.Ignore;

/**
 * User: AmilaJ (amilaj@apache.org)
 * Date: 6/19/13
 * Time: 3:56 PM
 */

@Ignore("Lonestar is taking too much time to run tests. Not sure why.")
public class LoneStarGramTest extends GramJobSubmissionManagerTest {

    private ExecutionContext executionContext;

    public void setUp() throws Exception {
        super.setUp();

        executionContext = getDefaultExecutionContext();
        executionContext.setHost("lonestar");
        executionContext.addGramJobNotifier(new GramJobLogger());

    }

    public void testExecuteJobLoneStarInteractive() throws Exception {

        executionContext.setInteractive(true);
        executeJob(executionContext);
    }

    public void testMonitoringRunningJobsLoneStar() throws Exception {

        executionContext.setInteractive(true);
        monitoringRunningJobs(executionContext);
    }

    public void testCancelJobsLoneStar() throws Exception {

        executionContext.setInteractive(true);
        cancelJob(executionContext);
    }


}
