package sg.bigo.ads.core.mraid;

import androidx.annotation.NonNull;

/* loaded from: classes14.dex */
public enum g {
    CLOSE("close"),
    UNLOAD("unload"),
    EXPAND { // from class: sg.bigo.ads.core.mraid.g.1
        @Override // sg.bigo.ads.core.mraid.g
        final boolean a(@NonNull n nVar) {
            return nVar == n.INLINE;
        }
    },
    USE_CUSTOM_CLOSE("usecustomclose"),
    OPEN { // from class: sg.bigo.ads.core.mraid.g.2
        @Override // sg.bigo.ads.core.mraid.g
        final boolean a(@NonNull n nVar) {
            return true;
        }
    },
    RESIZE { // from class: sg.bigo.ads.core.mraid.g.3
        @Override // sg.bigo.ads.core.mraid.g
        final boolean a(@NonNull n nVar) {
            return true;
        }
    },
    SET_ORIENTATION_PROPERTIES(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.h),
    PLAY_VIDEO { // from class: sg.bigo.ads.core.mraid.g.4
        @Override // sg.bigo.ads.core.mraid.g
        final boolean a(@NonNull n nVar) {
            return nVar == n.INLINE;
        }
    },
    STORE_PICTURE { // from class: sg.bigo.ads.core.mraid.g.5
        @Override // sg.bigo.ads.core.mraid.g
        final boolean a(@NonNull n nVar) {
            return true;
        }
    },
    CREATE_CALENDAR_EVENT { // from class: sg.bigo.ads.core.mraid.g.6
        @Override // sg.bigo.ads.core.mraid.g
        final boolean a(@NonNull n nVar) {
            return true;
        }
    },
    UNSPECIFIED("");


    @NonNull
    final String l;

    g(String str) {
        this.l = str;
    }

    /* synthetic */ g(String str, byte b) {
        this(str);
    }

    static g a(@NonNull String str) {
        for (g gVar : values()) {
            if (gVar.l.equals(str)) {
                return gVar;
            }
        }
        return UNSPECIFIED;
    }

    boolean a(@NonNull n nVar) {
        return false;
    }
}
