package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes7.dex */
interface MessageInfo {
    MessageLite getDefaultInstance();

    ProtoSyntax getSyntax();

    boolean isMessageSetWireFormat();
}
