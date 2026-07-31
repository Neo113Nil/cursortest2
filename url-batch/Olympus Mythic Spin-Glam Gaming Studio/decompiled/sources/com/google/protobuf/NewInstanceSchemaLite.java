package com.google.protobuf;

/* loaded from: classes5.dex */
final class NewInstanceSchemaLite implements NewInstanceSchema {
    NewInstanceSchemaLite() {
    }

    @Override // com.google.protobuf.NewInstanceSchema
    public Object newInstance(Object obj) {
        return ((GeneratedMessageLite) obj).newMutableInstance();
    }
}
