/*
 * Copyright (c) 2016, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

package org.eclipse.yasson.serializers.model;

import jakarta.json.bind.serializer.JsonbSerializer;
import jakarta.json.bind.serializer.SerializationContext;
import jakarta.json.stream.JsonGenerator;

/**
 * @author Roman Grigoriadi
 */
public class AnnotatedWithSerializerTypeSerializerOverride implements JsonbSerializer<AnnotatedWithSerializerType> {

    @Override
    public void serialize(AnnotatedWithSerializerType obj, JsonGenerator generator, SerializationContext ctx) {
        generator.writeStartObject();
        generator.write("valueField", "overridden value");
        generator.writeEnd();
    }
}