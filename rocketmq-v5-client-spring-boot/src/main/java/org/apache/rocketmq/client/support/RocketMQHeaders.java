/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.client.support;

import java.util.HashSet;
import java.util.Set;

public class RocketMQHeaders {
    public static final String PREFIX = "rocketmq_";
    public static final String KEYS = "KEYS";
    public static final String TAGS = "TAGS";
    public static final String TOPIC = "TOPIC";
    public static final String MESSAGE_ID = "MESSAGE_ID";
    public static final String BORN_TIMESTAMP = "BORN_TIMESTAMP";
    public static final String BORN_HOST = "BORN_HOST";
    public static final String FLAG = "FLAG";
    public static final String QUEUE_ID = "QUEUE_ID";
    public static final String SYS_FLAG = "SYS_FLAG";
    public static final String TRANSACTION_ID = "TRANSACTION_ID";
    public static final String DELAY = "DELAY";
    public static final String WAIT = "WAIT";

    public static final Set<String> SYSTEM_PROPERTY_SET = new HashSet<String>() {
        {
            add(KEYS);
            add(TAGS);
            add(KEYS);
            add(TOPIC);
            add(MESSAGE_ID);
            add(BORN_TIMESTAMP);
            add(BORN_HOST);
            add(FLAG);
            add(QUEUE_ID);
            add(SYS_FLAG);
            add(TRANSACTION_ID);
            add(DELAY);
            add(WAIT);
        }
    };
}
