package expo.modules.contacts.models;

import android.content.ContentProviderOperation;
import android.database.Cursor;
import android.provider.ContactsContract;
import com.amazon.a.a.o.b;
import expo.modules.contacts.Columns;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import io.intercom.android.sdk.models.AttributeType;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: DateModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, d2 = {"Lexpo/modules/contacts/models/DateModel;", "Lexpo/modules/contacts/models/BaseModel;", "<init>", "()V", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_CONTENT_TYPE_KEY, "", "getContentType", "()Ljava/lang/String;", "dataAlias", "getDataAlias", "mapStringToType", "", "label", "getLabelFromCursor", b.b, "Landroid/database/Cursor;", "getInsertOperation", "Landroid/content/ContentProviderOperation;", "rawId", "formatDateString", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class DateModel extends BaseModel {
    private final String contentType = "vnd.android.cursor.item/contact_event";
    private final String dataAlias = AttributeType.DATE;

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
        int hashCode = label.hashCode();
        return hashCode != -940675184 ? hashCode != 106069776 ? (hashCode == 1069376125 && label.equals(DateModelKt.BIRTHDAY)) ? 3 : 0 : !label.equals("other") ? 0 : 2 : label.equals("anniversary") ? 1 : 0;
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
            return "anniversary";
        }
        if (i == 2) {
            return "other";
        }
        if (i == 3) {
            return DateModelKt.BIRTHDAY;
        }
        return "unknown";
    }

    @Override // expo.modules.contacts.models.BaseModel
    public ContentProviderOperation getInsertOperation(String rawId) {
        ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
        Intrinsics.checkNotNullExpressionValue(newInsert, "newInsert(...)");
        if (rawId == null) {
            newInsert.withValueBackReference("raw_contact_id", 0);
        } else {
            newInsert.withValue("raw_contact_id", rawId);
        }
        ContentProviderOperation build = newInsert.withValue(Columns.MIMETYPE, getContentType()).withValue(Columns.TYPE, Integer.valueOf(mapStringToType(getLabel()))).withValue(Columns.DATA, formatDateString()).withValue(Columns.LABEL, getLabel()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final String formatDateString() {
        String data = getData();
        if (data != null) {
            return data;
        }
        Integer valueOf = Integer.valueOf((int) getMap().getDouble("year", -1.0d));
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        Integer valueOf2 = Integer.valueOf((int) getMap().getDouble("month", -1.0d));
        if (valueOf2.intValue() < 0) {
            valueOf2 = null;
        }
        Integer valueOf3 = valueOf2 != null ? Integer.valueOf(valueOf2.intValue() + 1) : null;
        Integer valueOf4 = Integer.valueOf((int) getMap().getDouble("day", -1.0d));
        if (valueOf4.intValue() <= 0) {
            valueOf4 = null;
        }
        if (valueOf != null && valueOf3 != null && valueOf4 != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "%04d-%02d-%02d", Arrays.copyOf(new Object[]{valueOf, valueOf3, valueOf4}, 3));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }
        if (valueOf3 == null || valueOf4 == null) {
            return null;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String format2 = String.format(Locale.US, "--%02d-%02d", Arrays.copyOf(new Object[]{valueOf3, valueOf4}, 2));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }
}
