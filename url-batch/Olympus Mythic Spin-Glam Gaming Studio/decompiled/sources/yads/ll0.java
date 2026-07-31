package yads;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.List;

/* loaded from: classes6.dex */
public final class ll0 extends uz2 {
    public final ul0 m;

    public ll0(List list) {
        byte[] bArr = (byte[]) list.get(0);
        int length = bArr.length;
        this.m = new ul0(((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED), (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // yads.uz2
    public final yads.c53 a(byte[] r47, int r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ll0.a(byte[], int, boolean):yads.c53");
    }
}
