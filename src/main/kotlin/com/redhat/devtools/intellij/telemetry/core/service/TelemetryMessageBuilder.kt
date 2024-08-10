/*******************************************************************************
 * Copyright (c) 2024 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package com.redhat.devtools.intellij.telemetry.core.service;

import kotlin.Exception

class TelemetryMessageBuilder constructor(@Suppress("UNUSED_PARAMETER") cl: ClassLoader) {
    class ActionMessage {
        fun property(@Suppress("UNUSED_PARAMETER") k: String, @Suppress("UNUSED_PARAMETER") v: String?): TelemetryMessageBuilder.ActionMessage {
            return this;
        }

        fun send() {
            // no nothing
        }

        fun success(): ActionMessage {
            return ActionMessage();
        }

        fun error(@Suppress("UNUSED_PARAMETER") e: String): ActionMessage {
            return ActionMessage();
        }

        fun error(@Suppress("UNUSED_PARAMETER") e: Exception): ActionMessage {
            return ActionMessage();
        }
    }
    fun action(@Suppress("UNUSED_PARAMETER") a: String) : ActionMessage {
        return ActionMessage();
    }
}