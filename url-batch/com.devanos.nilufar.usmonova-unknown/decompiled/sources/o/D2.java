package o;

import android.content.ClipData;
import android.view.ContentInfo;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;

/* loaded from: classes.dex */
public abstract /* synthetic */ class D2 {
    public static /* synthetic */ ContentInfo.Builder e(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo g(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* synthetic */ ViewTranslationRequest.Builder k(AutofillId autofillId, long j) {
        return new ViewTranslationRequest.Builder(autofillId, j);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse m(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* synthetic */ void p() {
    }
}
