/*******************************************************************************
 * Copyright (c) 2019 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.intellij.kubernetes.model

import io.fabric8.kubernetes.api.model.HasMetadata
import io.fabric8.kubernetes.api.model.Pod
import io.fabric8.kubernetes.client.NamespacedKubernetesClient

class PodsProvider(private val client: NamespacedKubernetesClient, private val namespace: HasMetadata): ResourceKindProvider {

    companion object {
        val KIND = Pod::class.java;
    }

    override val kind = KIND

    override val resources: MutableList<Pod> = mutableListOf()
        get() {
            if (field.isEmpty()) {
                val pods = client.pods().inNamespace(namespace.metadata.name).list().items
                field.addAll(pods)
            }
            return field
        }
}
