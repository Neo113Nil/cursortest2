package expo.modules.contacts.models;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.amazon.a.a.o.b;
import expo.modules.contacts.Columns;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImAddressModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lexpo/modules/contacts/models/ImAddressModel;", "Lexpo/modules/contacts/models/BaseModel;", "<init>", "()V", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_CONTENT_TYPE_KEY, "", "getContentType", "()Ljava/lang/String;", "dataAlias", "getDataAlias", "serializeService", "protocol", "", "fromCursor", "", b.b, "Landroid/database/Cursor;", "contentValues", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImAddressModel extends BaseModel {
    private final String contentType = "vnd.android.cursor.item/im";
    private final String dataAlias = HintConstants.AUTOFILL_HINT_USERNAME;

    @Override // expo.modules.contacts.CommonProvider
    public String getContentType() {
        return this.contentType;
    }

    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getDataAlias() {
        return this.dataAlias;
    }

    private final String serializeService(int protocol) {
        switch (protocol) {
            case -1:
                return "custom";
            case 0:
                return "aim";
            case 1:
                return "msn";
            case 2:
                return "yahoo";
            case 3:
                return "skype";
            case 4:
                return "qq";
            case 5:
                return "googleTalk";
            case 6:
                return "icq";
            case 7:
                return "jabber";
            case 8:
                return "netmeeting";
            default:
                return "unknown";
        }
    }

    @Override // expo.modules.contacts.models.BaseModel
    public void fromCursor(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        super.fromCursor(cursor);
        getMap().putString(NotificationCompat.CATEGORY_SERVICE, serializeService(cursor.getInt(cursor.getColumnIndexOrThrow(Columns.DATA_5))));
    }

    @Override // expo.modules.contacts.models.BaseModel
    public ContentValues getContentValues() {
        ContentValues contentValues = super.getContentValues();
        contentValues.put(Columns.DATA_5, getString(NotificationCompat.CATEGORY_SERVICE));
        return contentValues;
    }
}
