package o;

import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.database.android.AndroidAppCheckTokenProvider;
import com.google.firebase.database.android.AndroidAuthTokenProvider;
import com.google.firebase.database.core.TokenProvider;

/* renamed from: o.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2064v2 implements InterfaceC1224iG, InterfaceC0960eG {
    public final /* synthetic */ int h;
    public final /* synthetic */ TokenProvider.GetTokenCompletionListener i;

    public /* synthetic */ C2064v2(TokenProvider.GetTokenCompletionListener getTokenCompletionListener, int i) {
        this.h = i;
        this.i = getTokenCompletionListener;
    }

    @Override // o.InterfaceC1224iG
    public void c(Object obj) {
        switch (this.h) {
            case 0:
                AndroidAppCheckTokenProvider.lambda$getToken$1(this.i, (AppCheckTokenResult) obj);
                break;
            default:
                AndroidAuthTokenProvider.lambda$getToken$1(this.i, (GetTokenResult) obj);
                break;
        }
    }

    @Override // o.InterfaceC0960eG
    public void d(Exception exc) {
        switch (this.h) {
            case 1:
                AndroidAppCheckTokenProvider.lambda$getToken$2(this.i, exc);
                break;
            default:
                AndroidAuthTokenProvider.lambda$getToken$2(this.i, exc);
                break;
        }
    }
}
