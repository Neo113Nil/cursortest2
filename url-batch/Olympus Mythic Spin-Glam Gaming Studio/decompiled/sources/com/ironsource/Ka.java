package com.ironsource;

import com.facebook.login.LoginLogger;
import com.ironsource.InterfaceC4807ob;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes11.dex */
public final class Ka {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(InterfaceC4807ob<LevelPlayAdInfo> interfaceC4807ob) {
        if (interfaceC4807ob instanceof InterfaceC4807ob.b) {
            return "success";
        }
        if (interfaceC4807ob instanceof InterfaceC4807ob.a) {
            return LoginLogger.EVENT_EXTRAS_FAILURE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
