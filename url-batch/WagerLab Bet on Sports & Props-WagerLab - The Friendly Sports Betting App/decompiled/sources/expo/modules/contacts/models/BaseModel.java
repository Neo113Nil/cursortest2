package expo.modules.contacts.models;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.amazon.a.a.o.b;
import expo.modules.contacts.Columns;
import expo.modules.contacts.CommonProvider;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: BaseModel.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 82\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0016J4\u0010\u0013\u001a\u00020\u00142\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0004J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010\tH\u0016J\u000e\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\tJ\u0012\u0010,\u001a\u0004\u0018\u00010\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\tJ\u001e\u0010-\u001a\u00020\u00142\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016H\u0016J\u0012\u0010.\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J$\u0010/\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0018\u001a\u0004\u0018\u00010\t2\b\u00100\u001a\u0004\u0018\u00010\tH\u0004J$\u00101\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0018\u001a\u0004\u0018\u00010\t2\b\u00100\u001a\u0004\u0018\u00010\tH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u000bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b%\u0010\u000bR\u0013\u0010&\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b'\u0010\u000bR\u0013\u0010(\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b)\u0010\u000bR\u0014\u0010*\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00102\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u000e\u00106\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u000b¨\u00069"}, d2 = {"Lexpo/modules/contacts/models/BaseModel;", "Lexpo/modules/contacts/CommonProvider;", "<init>", "()V", "map", "Landroid/os/Bundle;", "getMap", "()Landroid/os/Bundle;", "dataAlias", "", "getDataAlias", "()Ljava/lang/String;", "labelAlias", "getLabelAlias", "idAlias", "getIdAlias", "mapStringToType", "", "label", "mapValue", "", "readableMap", "", "", "key", "alias", "fromCursor", b.b, "Landroid/database/Cursor;", "insertOperation", "Landroid/content/ContentProviderOperation;", "getInsertOperation", "()Landroid/content/ContentProviderOperation;", "rawId", "getDeleteOperation", "id", "getId", "getLabel", "data", "getData", "type", "getType", "isPrimary", "()I", "getString", "fromMap", "getLabelFromCursor", "putString", "androidKey", "putInt", "contentValues", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "typeAlias", "isPrimaryAlias", "Companion", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BaseModel implements CommonProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Bundle map = new Bundle();
    private final String dataAlias = Columns.DATA;
    private final String labelAlias = "label";
    private final String idAlias = "id";
    private final String typeAlias = "type";

    public int mapStringToType(String label) {
        return 0;
    }

    public final Bundle getMap() {
        return this.map;
    }

    @Override // expo.modules.contacts.CommonProvider
    public String getDataAlias() {
        return this.dataAlias;
    }

    @Override // expo.modules.contacts.CommonProvider
    public String getLabelAlias() {
        return this.labelAlias;
    }

    @Override // expo.modules.contacts.CommonProvider
    public String getIdAlias() {
        return this.idAlias;
    }

    public static /* synthetic */ void mapValue$default(BaseModel baseModel, Map map, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mapValue");
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        baseModel.mapValue(map, str, str2);
    }

    protected final void mapValue(Map<String, ? extends Object> readableMap, String key, String alias) {
        Intrinsics.checkNotNullParameter(readableMap, "readableMap");
        if (readableMap.containsKey(key)) {
            Object obj = readableMap.get(key);
            if (obj instanceof Boolean) {
                Bundle bundle = this.map;
                if (alias != null) {
                    key = alias;
                }
                bundle.putBoolean(key, ((Boolean) obj).booleanValue());
                return;
            }
            if (obj instanceof String) {
                Bundle bundle2 = this.map;
                if (alias != null) {
                    key = alias;
                }
                bundle2.putString(key, (String) obj);
                return;
            }
            if (obj instanceof Double) {
                Bundle bundle3 = this.map;
                if (alias != null) {
                    key = alias;
                }
                bundle3.putDouble(key, ((Number) obj).doubleValue());
            }
        }
    }

    public void fromCursor(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        putString(cursor, getIdAlias(), Columns.ID);
        this.map.putString(getLabelAlias(), getLabelFromCursor(cursor));
        putString(cursor, getDataAlias(), Columns.DATA);
        putString(cursor, Columns.LABEL, Columns.LABEL);
        putString(cursor, this.typeAlias, Columns.TYPE);
        putInt(cursor, isPrimaryAlias(), Columns.IS_PRIMARY);
    }

    public final ContentProviderOperation getInsertOperation() {
        return getInsertOperation(null);
    }

    public ContentProviderOperation getInsertOperation(String rawId) {
        ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
        Intrinsics.checkNotNullExpressionValue(newInsert, "newInsert(...)");
        if (rawId == null) {
            newInsert.withValueBackReference("raw_contact_id", 0);
        } else {
            newInsert.withValue("raw_contact_id", rawId);
        }
        ContentProviderOperation build = newInsert.withValue(Columns.MIMETYPE, getContentType()).withValue(Columns.TYPE, Integer.valueOf(mapStringToType(getLabel()))).withValue(Columns.DATA, getData()).withValue(Columns.ID, getId()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public final ContentProviderOperation getDeleteOperation(String rawId) {
        Intrinsics.checkNotNullParameter(rawId, "rawId");
        ContentProviderOperation.Builder newDelete = ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s=? AND %s=?", Arrays.copyOf(new Object[]{Columns.MIMETYPE, "raw_contact_id"}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        ContentProviderOperation build = newDelete.withSelection(format, new String[]{getContentType(), rawId}).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final String getId() {
        return getString(getIdAlias());
    }

    public final String getLabel() {
        return getString(getLabelAlias());
    }

    public final String getData() {
        return getString(getDataAlias());
    }

    public final String getType() {
        return getString(this.typeAlias);
    }

    private final int isPrimary() {
        return (this.map.containsKey(isPrimaryAlias()) && this.map.getBoolean(isPrimaryAlias())) ? 1 : 0;
    }

    public final String getString(String key) {
        if (this.map.containsKey(key)) {
            return this.map.getString(key);
        }
        return null;
    }

    public void fromMap(Map<String, ? extends Object> readableMap) {
        Intrinsics.checkNotNullParameter(readableMap, "readableMap");
        Iterator<String> it = readableMap.keySet().iterator();
        while (it.hasNext()) {
            mapValue$default(this, readableMap, it.next(), null, 4, null);
        }
    }

    protected String getLabelFromCursor(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        if (cursor.getInt(cursor.getColumnIndexOrThrow(Columns.TYPE)) != 0) {
            return null;
        }
        String string = cursor.getString(cursor.getColumnIndexOrThrow(Columns.LABEL));
        return string == null ? "unknown" : string;
    }

    protected final void putString(Cursor cursor, String key, String androidKey) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        int columnIndex = cursor.getColumnIndex(androidKey);
        if (columnIndex == -1) {
            return;
        }
        String string = cursor.getString(columnIndex);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.map.putString(key, string);
    }

    private final void putInt(Cursor cursor, String key, String androidKey) {
        int columnIndex = cursor.getColumnIndex(androidKey);
        if (columnIndex == -1) {
            return;
        }
        this.map.putInt(key, cursor.getInt(columnIndex));
    }

    public ContentValues getContentValues() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Columns.MIMETYPE, getContentType());
        contentValues.put(Columns.DATA, getData());
        contentValues.put(Columns.TYPE, Integer.valueOf(mapStringToType(getLabel())));
        contentValues.put(Columns.LABEL, getLabel());
        contentValues.put(Columns.ID, getId());
        contentValues.put(Columns.IS_PRIMARY, Integer.valueOf(isPrimary()));
        return contentValues;
    }

    private final String isPrimaryAlias() {
        return "isPrimary";
    }

    /* compiled from: BaseModel.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u0004\u001a\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u0005\"\b\b\u0000\u0010\u0006*\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n\u0018\u00010\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00060\r¨\u0006\u000e"}, d2 = {"Lexpo/modules/contacts/models/BaseModel$Companion;", "", "<init>", "()V", "decodeList", "", "T", "Lexpo/modules/contacts/models/BaseModel;", MetricTracker.Object.INPUT, "", "", "", "clazz", "Ljava/lang/Class;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T extends BaseModel> List<T> decodeList(List<? extends Map<String, ? extends Object>> input, Class<T> clazz) throws IllegalAccessException, InstantiationException {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            if (input == null) {
                return null;
            }
            List<? extends Map<String, ? extends Object>> list = input;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Map<String, ? extends Object> map : list) {
                T newInstance = clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                newInstance.fromMap(map);
                arrayList.add(newInstance);
            }
            return CollectionsKt.toMutableList((Collection) arrayList);
        }
    }
}
