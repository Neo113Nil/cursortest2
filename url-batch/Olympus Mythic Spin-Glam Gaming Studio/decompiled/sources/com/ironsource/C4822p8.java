package com.ironsource;

/* renamed from: com.ironsource.p8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C4822p8 {

    /* renamed from: com.ironsource.p8$a */
    public enum a {
        None,
        Device,
        Controller
    }

    /* renamed from: com.ironsource.p8$b */
    public enum b {
        None,
        Loading,
        Loaded,
        Ready,
        Failed
    }

    /* renamed from: com.ironsource.p8$c */
    public enum c {
        Web,
        Native,
        None
    }

    /* renamed from: com.ironsource.p8$d */
    public enum d {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);

        private int a;

        d(int i) {
            this.a = i;
        }

        public int b() {
            return this.a;
        }
    }

    /* renamed from: com.ironsource.p8$e */
    public enum e {
        Banner,
        Interstitial,
        RewardedVideo,
        NativeAd,
        None
    }
}
