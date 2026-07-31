package com.google.protobuf;

/* loaded from: classes13.dex */
interface MessageInfoFactory {
    boolean isSupported(Class cls);

    MessageInfo messageInfoFor(Class cls);
}
