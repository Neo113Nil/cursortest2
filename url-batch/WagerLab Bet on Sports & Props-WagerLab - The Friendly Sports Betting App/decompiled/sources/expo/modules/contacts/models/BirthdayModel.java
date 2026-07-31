package expo.modules.contacts.models;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BirthdayModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0016¨\u0006\n"}, d2 = {"Lexpo/modules/contacts/models/BirthdayModel;", "Lexpo/modules/contacts/models/DateModel;", "<init>", "()V", "fromMap", "", "readableMap", "", "", "", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BirthdayModel extends DateModel {
    @Override // expo.modules.contacts.models.BaseModel
    public void fromMap(Map<String, ? extends Object> readableMap) {
        Intrinsics.checkNotNullParameter(readableMap, "readableMap");
        super.fromMap(readableMap);
        getMap().putString("label", DateModelKt.BIRTHDAY);
    }
}
