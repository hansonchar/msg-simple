/*
 * Copyright (c) 2014, Francis Galiegue (fgaliegue@gmail.com)
 *
 * This software is dual-licensed under:
 *
 * - the Lesser General Public License (LGPL) version 3.0 or, at your option, any
 *   later version;
 * - the Apache Software License (ASL) version 2.0.
 *
 * The text of both licenses is available under the src/resources/ directory of
 * this project (under the names LGPL-3.0.txt and ASL-2.0.txt respectively).
 *
 * Direct link to the sources:
 *
 * - LGPL 3.0: https://www.gnu.org/licenses/lgpl-3.0.txt
 * - ASL 2.0: http://www.apache.org/licenses/LICENSE-2.0.txt
 */

package com.github.fge.msgsimple.provider;

import com.github.fge.msgsimple.source.MessageSource;

import java.io.IOException;
import java.util.Locale;

/**
 * Load a message source for a given locale
 *
 * @see LoadingMessageSourceProvider
 */
public interface MessageSourceLoader
{
    /**
     * Load a message source for a locale
     *
     * @param locale the locale (guaranteed never to be {@code null}
     * @return a message source ({@code null} if not found)
     * @throws IOException loading error
     */
    MessageSource load(final Locale locale)
        throws IOException;
}
