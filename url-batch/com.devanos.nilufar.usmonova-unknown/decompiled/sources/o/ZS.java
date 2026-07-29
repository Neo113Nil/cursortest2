package o;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ZS implements SpellCheckerSession.SpellCheckerSessionListener {
    public final C1818rJ a;
    public final TextServicesManager b;
    public SpellCheckerSession c;
    public NC d;

    public ZS(TextServicesManager textServicesManager, C1818rJ c1818rJ) {
        this.b = textServicesManager;
        this.a = c1818rJ;
        c1818rJ.i = this;
    }

    public final void a(String str, String str2, NC nc) {
        if (this.d != null) {
            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Previous spell check request still pending.", null);
            return;
        }
        this.d = nc;
        Locale a = LA.a(str);
        if (this.c == null) {
            this.c = this.b.newSpellCheckerSession(null, a, this, true);
        }
        this.c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.d.d(new ArrayList());
            this.d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.d.d(new ArrayList());
            this.d = null;
            return;
        }
        for (int i = 0; i < sentenceSuggestionsInfo.getSuggestionsCount(); i++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i) + offsetAt;
                hashMap.put("startIndex", Integer.valueOf(offsetAt));
                hashMap.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z = false;
                for (int i2 = 0; i2 < suggestionsCount; i2++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i2);
                    if (!suggestionAt.isEmpty()) {
                        arrayList2.add(suggestionAt);
                        z = true;
                    }
                }
                if (z) {
                    hashMap.put("suggestions", arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.d.d(arrayList);
        this.d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
