package expo.modules.contacts.models;

import android.database.Cursor;
import com.amazon.a.a.o.b;
import expo.modules.contacts.Columns;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExtraNameModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0010"}, d2 = {"Lexpo/modules/contacts/models/ExtraNameModel;", "Lexpo/modules/contacts/models/BaseModel;", "<init>", "()V", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_CONTENT_TYPE_KEY, "", "getContentType", "()Ljava/lang/String;", "dataAlias", "getDataAlias", "mapStringToType", "", "label", "getLabelFromCursor", b.b, "Landroid/database/Cursor;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtraNameModel extends BaseModel {
    private final String contentType = "vnd.android.cursor.item/nickname";
    private final String dataAlias = "value";

    @Override // expo.modules.contacts.CommonProvider
    public String getContentType() {
        return this.contentType;
    }

    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getDataAlias() {
        return this.dataAlias;
    }

    @Override // expo.modules.contacts.models.BaseModel
    public int mapStringToType(String label) {
        if (label == null) {
            return 0;
        }
        switch (label.hashCode()) {
            case -2028219097:
                return !label.equals("shortName") ? 0 : 4;
            case -1946065477:
                return !label.equals("otherName") ? 0 : 2;
            case 269062575:
                return !label.equals("initials") ? 0 : 5;
            case 688538947:
                return !label.equals("maidenName") ? 0 : 3;
            case 1544803905:
                return !label.equals("default") ? 0 : 1;
            default:
                return 0;
        }
    }

    @Override // expo.modules.contacts.models.BaseModel
    protected String getLabelFromCursor(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        String labelFromCursor = super.getLabelFromCursor(cursor);
        if (labelFromCursor != null) {
            return labelFromCursor;
        }
        int i = cursor.getInt(cursor.getColumnIndexOrThrow(Columns.TYPE));
        if (i == 1) {
            return "nickname";
        }
        if (i == 2) {
            return "otherName";
        }
        if (i == 3) {
            return "maidenName";
        }
        if (i == 4) {
            return "shortName";
        }
        if (i == 5) {
            return "initials";
        }
        return "unknown";
    }
}
