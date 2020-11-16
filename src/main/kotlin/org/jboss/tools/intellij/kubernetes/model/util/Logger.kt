/*******************************************************************************
 * Copyright (c) 2020 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.intellij.kubernetes.model.util

import com.intellij.openapi.diagnostic.Logger

fun categoryLogger(): Logger {
	return com.intellij.openapi.diagnostic.logger("org.jboss.tools.intellij.kubernetes")
}

fun Logger.debugWithClass(clazz: Class<*>, message: String) {
	this.debug("${clazz.simpleName}: $message")
}

fun Logger.debugWithClass(clazz: Class<*>, message: String, t: Throwable?) {
	this.debug("${clazz.simpleName}: $message", t)
}