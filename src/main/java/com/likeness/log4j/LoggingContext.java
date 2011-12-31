/**
 * Copyright (C) 2011 Ness Computing, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.likeness.log4j;

import java.net.URL;

/**
 * Represents a logging file on the classpath.
 */
public class LoggingContext
{
    private final String context;
    private final String configName;
    private final URL configUrl;

    /**
     * Create a new logging context based off the name of the
     * @param context
     * @param configName
     * @param configUrl
     */
    LoggingContext(final String context, final String configName, final URL configUrl)
    {
        this.context = context;
        this.configName = configName;
        this.configUrl = configUrl;
    }

    public String getContext()
    {
        return context;
    }

    public String getConfigName()
    {
        return configName;
    }

    public URL getConfigUrl()
    {
        return configUrl;
    }


    /**
     * Creates a logging context from a file on the classpath.
     */
    public static LoggingContext loadFromClasspath(final String contextName, final String fileName)
    {
        return new LoggingContext(contextName, fileName, LoggingContext.class.getResource(fileName));
    }
}
