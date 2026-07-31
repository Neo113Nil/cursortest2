package expo.modules.contacts;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.text.util.LocalePreferences;
import com.amazon.a.a.o.b;
import com.facebook.appevents.AppEventsConstants;
import expo.modules.contacts.models.BaseModel;
import expo.modules.contacts.models.DateModel;
import expo.modules.contacts.models.DateModelKt;
import expo.modules.contacts.models.EmailModel;
import expo.modules.contacts.models.ExtraNameModel;
import expo.modules.contacts.models.ImAddressModel;
import expo.modules.contacts.models.PhoneNumberModel;
import expo.modules.contacts.models.PostalAddressModel;
import expo.modules.contacts.models.RelationshipModel;
import expo.modules.contacts.models.UrlAddressModel;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* compiled from: Contact.kt */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020lJ\u0006\u0010m\u001a\u00020\u0003J\u0006\u0010n\u001a\u00020\u0003J\b\u0010o\u001a\u0004\u0018\u00010\u0003J\u0010\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020sH\u0002J\u0016\u0010t\u001a\u0012\u0012\u0004\u0012\u00020v0uj\b\u0012\u0004\u0012\u00020v`wJ\u001a\u0010x\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010v0uj\n\u0012\u0006\u0012\u0004\u0018\u00010v`wJ\u0018\u0010y\u001a\u00020v2\u0006\u0010z\u001a\u00020\u00032\u0006\u0010{\u001a\u00020\u0003H\u0002J\u0018\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u000e\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020\u00030\u0088\u0001J\u0011\u0010\u008d\u0001\u001a\u00020s2\u0006\u0010\u001b\u001a\u00020\u0003H\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\t\"\u0004\b\"\u0010\u000bR\u001c\u0010#\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\t\"\u0004\b%\u0010\u000bR\u001c\u0010&\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010\u000bR\u001c\u0010)\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010\u000bR\u001c\u0010,\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\t\"\u0004\b.\u0010\u000bR\u001c\u0010/\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\t\"\u0004\b1\u0010\u000bR\u001c\u00102\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\t\"\u0004\b4\u0010\u000bR\u001c\u00105\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\t\"\u0004\b7\u0010\u000bR\u001c\u00108\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\t\"\u0004\b:\u0010\u000bR\u001c\u0010;\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\t\"\u0004\b=\u0010\u000bR\u001c\u0010>\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\t\"\u0004\b@\u0010\u000bR\u001c\u0010A\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\t\"\u0004\bC\u0010\u000bR \u0010D\u001a\b\u0012\u0004\u0012\u00020F0EX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR \u0010K\u001a\b\u0012\u0004\u0012\u00020L0EX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010H\"\u0004\bN\u0010JR \u0010O\u001a\b\u0012\u0004\u0012\u00020P0EX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010H\"\u0004\bR\u0010JR \u0010S\u001a\b\u0012\u0004\u0012\u00020T0EX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010H\"\u0004\bV\u0010JR \u0010W\u001a\b\u0012\u0004\u0012\u00020X0EX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010H\"\u0004\bZ\u0010JR \u0010[\u001a\b\u0012\u0004\u0012\u00020\\0EX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010H\"\u0004\b^\u0010JR \u0010_\u001a\b\u0012\u0004\u0012\u00020`0EX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010H\"\u0004\bb\u0010JR \u0010c\u001a\b\u0012\u0004\u0012\u00020d0EX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010H\"\u0004\bf\u0010JR\u001a\u0010g\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0018\"\u0004\bh\u0010\u001aR\"\u0010|\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u007f0~0}8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001d\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030}8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R&\u0010\u0089\u0001\u001a\u0014\u0012\u0005\u0012\u00030\u008a\u00010uj\t\u0012\u0005\u0012\u00030\u008a\u0001`w8F¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u008e\u0001"}, d2 = {"Lexpo/modules/contacts/Contact;", "", "contactId", "", "appContext", "Lexpo/modules/kotlin/AppContext;", "<init>", "(Ljava/lang/String;Lexpo/modules/kotlin/AppContext;)V", "getContactId", "()Ljava/lang/String;", "setContactId", "(Ljava/lang/String;)V", "getAppContext", "()Lexpo/modules/kotlin/AppContext;", "setAppContext", "(Lexpo/modules/kotlin/AppContext;)V", "rawContactId", "lookupKey", "getLookupKey", "setLookupKey", "displayName", "hasPhoto", "", "getHasPhoto", "()Z", "setHasPhoto", "(Z)V", "photoUri", "getPhotoUri", "setPhotoUri", "rawPhotoUri", "contactType", "firstName", "getFirstName", "setFirstName", "middleName", "getMiddleName", "setMiddleName", "lastName", "getLastName", "setLastName", "prefix", "getPrefix", "setPrefix", "suffix", "getSuffix", "setSuffix", "phoneticFirstName", "getPhoneticFirstName", "setPhoneticFirstName", "phoneticMiddleName", "getPhoneticMiddleName", "setPhoneticMiddleName", "phoneticLastName", "getPhoneticLastName", "setPhoneticLastName", "company", "getCompany", "setCompany", "department", "getDepartment", "setDepartment", "jobTitle", "getJobTitle", "setJobTitle", "note", "getNote", "setNote", "dates", "", "Lexpo/modules/contacts/models/DateModel;", "getDates", "()Ljava/util/List;", "setDates", "(Ljava/util/List;)V", "emails", "Lexpo/modules/contacts/models/EmailModel;", "getEmails", "setEmails", "imAddresses", "Lexpo/modules/contacts/models/ImAddressModel;", "getImAddresses", "setImAddresses", "phones", "Lexpo/modules/contacts/models/PhoneNumberModel;", "getPhones", "setPhones", "addresses", "Lexpo/modules/contacts/models/PostalAddressModel;", "getAddresses", "setAddresses", "relationships", "Lexpo/modules/contacts/models/RelationshipModel;", "getRelationships", "setRelationships", "urlAddresses", "Lexpo/modules/contacts/models/UrlAddressModel;", "getUrlAddresses", "setUrlAddresses", "extraNames", "Lexpo/modules/contacts/models/ExtraNameModel;", "getExtraNames", "setExtraNames", "isFavorite", "setFavorite", "fromCursor", "", b.b, "Landroid/database/Cursor;", "getFinalFirstName", "getFinalLastName", "getFinalDisplayName", "toByteArray", "", "bitmap", "Landroid/graphics/Bitmap;", "toInsertOperationList", "Ljava/util/ArrayList;", "Landroid/content/ContentProviderOperation;", "Lkotlin/collections/ArrayList;", "toUpdateOperationList", "getFlushOperation", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_CONTENT_TYPE_KEY, "rawId", "baseModels", "", "", "Lexpo/modules/contacts/models/BaseModel;", "getBaseModels", "()[Ljava/util/List;", "baseModelsContentType", "getBaseModelsContentType", "()[Ljava/lang/String;", "toMap", "Landroid/os/Bundle;", "fieldSet", "", "contentValues", "Landroid/content/ContentValues;", "getContentValues", "()Ljava/util/ArrayList;", "getThumbnailBitmap", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Contact {
    private List<PostalAddressModel> addresses;
    private AppContext appContext;
    private String company;
    private String contactId;
    private String contactType;
    private List<DateModel> dates;
    private String department;
    private String displayName;
    private List<EmailModel> emails;
    private List<ExtraNameModel> extraNames;
    private String firstName;
    private boolean hasPhoto;
    private List<ImAddressModel> imAddresses;
    private boolean isFavorite;
    private String jobTitle;
    private String lastName;
    private String lookupKey;
    private String middleName;
    private String note;
    private List<PhoneNumberModel> phones;
    private String phoneticFirstName;
    private String phoneticLastName;
    private String phoneticMiddleName;
    private String photoUri;
    private String prefix;
    private String rawContactId;
    private String rawPhotoUri;
    private List<RelationshipModel> relationships;
    private String suffix;
    private List<UrlAddressModel> urlAddresses;

    public Contact(String contactId, AppContext appContext) {
        Intrinsics.checkNotNullParameter(contactId, "contactId");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.contactId = contactId;
        this.appContext = appContext;
        this.contactType = "person";
        this.firstName = "";
        this.middleName = "";
        this.lastName = "";
        this.prefix = "";
        this.suffix = "";
        this.phoneticFirstName = "";
        this.phoneticMiddleName = "";
        this.phoneticLastName = "";
        this.company = "";
        this.department = "";
        this.jobTitle = "";
        this.dates = new ArrayList();
        this.emails = new ArrayList();
        this.imAddresses = new ArrayList();
        this.phones = new ArrayList();
        this.addresses = new ArrayList();
        this.relationships = new ArrayList();
        this.urlAddresses = new ArrayList();
        this.extraNames = new ArrayList();
    }

    public final AppContext getAppContext() {
        return this.appContext;
    }

    public final String getContactId() {
        return this.contactId;
    }

    public final void setAppContext(AppContext appContext) {
        Intrinsics.checkNotNullParameter(appContext, "<set-?>");
        this.appContext = appContext;
    }

    public final void setContactId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.contactId = str;
    }

    public final String getLookupKey() {
        return this.lookupKey;
    }

    public final void setLookupKey(String str) {
        this.lookupKey = str;
    }

    public final boolean getHasPhoto() {
        return this.hasPhoto;
    }

    public final void setHasPhoto(boolean z) {
        this.hasPhoto = z;
    }

    public final String getPhotoUri() {
        return this.photoUri;
    }

    public final void setPhotoUri(String str) {
        this.photoUri = str;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final void setFirstName(String str) {
        this.firstName = str;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final void setMiddleName(String str) {
        this.middleName = str;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final void setLastName(String str) {
        this.lastName = str;
    }

    public final String getPrefix() {
        return this.prefix;
    }

    public final void setPrefix(String str) {
        this.prefix = str;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final void setSuffix(String str) {
        this.suffix = str;
    }

    public final String getPhoneticFirstName() {
        return this.phoneticFirstName;
    }

    public final void setPhoneticFirstName(String str) {
        this.phoneticFirstName = str;
    }

    public final String getPhoneticMiddleName() {
        return this.phoneticMiddleName;
    }

    public final void setPhoneticMiddleName(String str) {
        this.phoneticMiddleName = str;
    }

    public final String getPhoneticLastName() {
        return this.phoneticLastName;
    }

    public final void setPhoneticLastName(String str) {
        this.phoneticLastName = str;
    }

    public final String getCompany() {
        return this.company;
    }

    public final void setCompany(String str) {
        this.company = str;
    }

    public final String getDepartment() {
        return this.department;
    }

    public final void setDepartment(String str) {
        this.department = str;
    }

    public final String getJobTitle() {
        return this.jobTitle;
    }

    public final void setJobTitle(String str) {
        this.jobTitle = str;
    }

    public final String getNote() {
        return this.note;
    }

    public final void setNote(String str) {
        this.note = str;
    }

    public final List<DateModel> getDates() {
        return this.dates;
    }

    public final void setDates(List<DateModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dates = list;
    }

    public final List<EmailModel> getEmails() {
        return this.emails;
    }

    public final void setEmails(List<EmailModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.emails = list;
    }

    public final List<ImAddressModel> getImAddresses() {
        return this.imAddresses;
    }

    public final void setImAddresses(List<ImAddressModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.imAddresses = list;
    }

    public final List<PhoneNumberModel> getPhones() {
        return this.phones;
    }

    public final void setPhones(List<PhoneNumberModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.phones = list;
    }

    public final List<PostalAddressModel> getAddresses() {
        return this.addresses;
    }

    public final void setAddresses(List<PostalAddressModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.addresses = list;
    }

    public final List<RelationshipModel> getRelationships() {
        return this.relationships;
    }

    public final void setRelationships(List<RelationshipModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.relationships = list;
    }

    public final List<UrlAddressModel> getUrlAddresses() {
        return this.urlAddresses;
    }

    public final void setUrlAddresses(List<UrlAddressModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.urlAddresses = list;
    }

    public final List<ExtraNameModel> getExtraNames() {
        return this.extraNames;
    }

    public final void setExtraNames(List<ExtraNameModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.extraNames = list;
    }

    /* renamed from: isFavorite, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    public final void setFavorite(boolean z) {
        this.isFavorite = z;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final void fromCursor(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        this.rawContactId = cursor.getString(cursor.getColumnIndexOrThrow("raw_contact_id"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow(Columns.MIMETYPE));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(Columns.DISPLAY_NAME));
        boolean z = false;
        this.isFavorite = cursor.getInt(cursor.getColumnIndexOrThrow(Columns.STARRED)) == 1;
        if (!TextUtils.isEmpty(string2) && TextUtils.isEmpty(this.displayName)) {
            this.displayName = string2;
        }
        if (TextUtils.isEmpty(this.rawPhotoUri)) {
            String string3 = cursor.getString(cursor.getColumnIndexOrThrow(Columns.PHOTO_URI));
            if (!TextUtils.isEmpty(string3)) {
                this.hasPhoto = true;
                this.rawPhotoUri = string3;
            }
        }
        if (TextUtils.isEmpty(this.photoUri)) {
            String string4 = cursor.getString(cursor.getColumnIndexOrThrow(Columns.PHOTO_THUMBNAIL_URI));
            if (!TextUtils.isEmpty(string4)) {
                this.hasPhoto = true;
                this.photoUri = string4;
            }
        }
        if (string != null) {
            switch (string.hashCode()) {
                case -1569536764:
                    if (string.equals("vnd.android.cursor.item/email_v2")) {
                        EmailModel emailModel = new EmailModel();
                        emailModel.fromCursor(cursor);
                        this.emails.add(emailModel);
                        break;
                    }
                    break;
                case -1328682538:
                    if (string.equals("vnd.android.cursor.item/contact_event")) {
                        DateModel dateModel = new DateModel();
                        dateModel.fromCursor(cursor);
                        this.dates.add(dateModel);
                        break;
                    }
                    break;
                case -1079224304:
                    if (string.equals("vnd.android.cursor.item/name")) {
                        this.lookupKey = cursor.getString(cursor.getColumnIndexOrThrow("lookup"));
                        this.firstName = cursor.getString(cursor.getColumnIndexOrThrow(Columns.TYPE));
                        this.middleName = cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_5));
                        this.lastName = cursor.getString(cursor.getColumnIndexOrThrow(Columns.LABEL));
                        this.prefix = cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_4));
                        this.suffix = cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_6));
                        this.phoneticFirstName = cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_7));
                        this.phoneticMiddleName = cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_8));
                        this.phoneticLastName = cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_9));
                        break;
                    }
                    break;
                case -1079210633:
                    if (string.equals("vnd.android.cursor.item/note")) {
                        this.note = cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA));
                        break;
                    }
                    break;
                case -601229436:
                    if (string.equals("vnd.android.cursor.item/postal-address_v2")) {
                        PostalAddressModel postalAddressModel = new PostalAddressModel();
                        postalAddressModel.fromCursor(cursor);
                        this.addresses.add(postalAddressModel);
                        break;
                    }
                    break;
                case 456415478:
                    if (string.equals("vnd.android.cursor.item/website")) {
                        UrlAddressModel urlAddressModel = new UrlAddressModel();
                        urlAddressModel.fromCursor(cursor);
                        this.urlAddresses.add(urlAddressModel);
                        break;
                    }
                    break;
                case 684173810:
                    if (string.equals("vnd.android.cursor.item/phone_v2")) {
                        PhoneNumberModel phoneNumberModel = new PhoneNumberModel();
                        phoneNumberModel.fromCursor(cursor);
                        this.phones.add(phoneNumberModel);
                        break;
                    }
                    break;
                case 689862072:
                    if (string.equals("vnd.android.cursor.item/organization")) {
                        this.company = cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA));
                        this.jobTitle = cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_4));
                        this.department = cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_5));
                        break;
                    }
                    break;
                case 950831081:
                    if (string.equals("vnd.android.cursor.item/im")) {
                        ImAddressModel imAddressModel = new ImAddressModel();
                        imAddressModel.fromCursor(cursor);
                        this.imAddresses.add(imAddressModel);
                        break;
                    }
                    break;
                case 1409846529:
                    if (string.equals("vnd.android.cursor.item/relation")) {
                        RelationshipModel relationshipModel = new RelationshipModel();
                        relationshipModel.fromCursor(cursor);
                        this.relationships.add(relationshipModel);
                        break;
                    }
                    break;
                case 2034973555:
                    if (string.equals("vnd.android.cursor.item/nickname")) {
                        ExtraNameModel extraNameModel = new ExtraNameModel();
                        extraNameModel.fromCursor(cursor);
                        this.extraNames.add(extraNameModel);
                        break;
                    }
                    break;
            }
        }
        String str = this.company;
        String str2 = "person";
        if (str != null && !Intrinsics.areEqual(str, "")) {
            String str3 = this.firstName;
            boolean z2 = (str3 == null || Intrinsics.areEqual(str3, "")) ? false : true;
            String str4 = this.middleName;
            boolean z3 = (str4 == null || Intrinsics.areEqual(str4, "")) ? false : true;
            String str5 = this.lastName;
            if (str5 != null && !Intrinsics.areEqual(str5, "")) {
                z = true;
            }
            if (!z2 && !z3 && !z) {
                str2 = "company";
            }
        }
        this.contactType = str2;
    }

    public final String getFinalFirstName() {
        String str = this.firstName;
        if (str == null) {
            str = this.displayName;
            if (str == null) {
                return "";
            }
            Intrinsics.checkNotNull(str);
        }
        return str;
    }

    public final String getFinalLastName() {
        String str = this.lastName;
        if (str == null) {
            str = this.displayName;
            if (str == null) {
                return "";
            }
            Intrinsics.checkNotNull(str);
        }
        return str;
    }

    public final String getFinalDisplayName() {
        String str;
        String str2 = this.displayName;
        if (str2 != null || (str = this.firstName) == null) {
            return str2;
        }
        if (this.lastName == null) {
            return str;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{this.firstName, this.lastName}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String str3 = format;
        int length = str3.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) str3.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return str3.subSequence(i, length + 1).toString();
    }

    private final byte[] toByteArray(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final ArrayList<ContentProviderOperation> toInsertOperationList() {
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", null).withValue("account_name", null).withValue(Columns.STARRED, Boolean.valueOf(this.isFavorite));
        Intrinsics.checkNotNullExpressionValue(withValue, "withValue(...)");
        arrayList.add(withValue.build());
        ContentProviderOperation.Builder withValue2 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/name").withValue(Columns.DATA, this.displayName).withValue(Columns.TYPE, this.firstName).withValue(Columns.DATA_5, this.middleName).withValue(Columns.LABEL, this.lastName).withValue(Columns.DATA_7, this.phoneticFirstName).withValue(Columns.DATA_8, this.phoneticMiddleName).withValue(Columns.DATA_9, this.phoneticLastName).withValue(Columns.DATA_4, this.prefix).withValue(Columns.DATA_6, this.suffix);
        Intrinsics.checkNotNullExpressionValue(withValue2, "withValue(...)");
        arrayList.add(withValue2.build());
        ContentProviderOperation.Builder withValue3 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/organization").withValue(Columns.DATA, this.company).withValue(Columns.DATA_4, this.jobTitle).withValue(Columns.DATA_5, this.department);
        Intrinsics.checkNotNullExpressionValue(withValue3, "withValue(...)");
        arrayList.add(withValue3.build());
        ContentProviderOperation.Builder withValue4 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/note").withValue(Columns.DATA, this.note);
        Intrinsics.checkNotNullExpressionValue(withValue4, "withValue(...)");
        arrayList.add(withValue4.build());
        withValue4.withYieldAllowed(true);
        String str = this.rawPhotoUri;
        if (str == null) {
            str = this.photoUri;
        }
        String str2 = str;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/photo").withValue("data15", toByteArray(getThumbnailBitmap(str))).build());
        }
        for (List<BaseModel> list : getBaseModels()) {
            Iterator<BaseModel> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getInsertOperation());
            }
        }
        return arrayList;
    }

    public final ArrayList<ContentProviderOperation> toUpdateOperationList() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s=? AND %s=?", Arrays.copyOf(new Object[]{Columns.CONTACT_ID, Columns.MIMETYPE}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String[] strArr = {this.contactId, "vnd.android.cursor.item/name"};
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        ContentProviderOperation.Builder withValue = ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection(format, strArr).withValue(Columns.DATA, this.displayName).withValue(Columns.TYPE, this.firstName).withValue(Columns.DATA_5, this.middleName).withValue(Columns.LABEL, this.lastName).withValue(Columns.DATA_7, this.phoneticFirstName).withValue(Columns.DATA_8, this.phoneticMiddleName).withValue(Columns.DATA_9, this.phoneticLastName).withValue(Columns.DATA_4, this.prefix).withValue(Columns.DATA_6, this.suffix);
        Intrinsics.checkNotNullExpressionValue(withValue, "withValue(...)");
        arrayList.add(withValue.build());
        ContentProviderOperation.Builder withValue2 = ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection(format, strArr).withValue(Columns.DATA, this.company).withValue(Columns.DATA_4, this.jobTitle).withValue(Columns.DATA_5, this.department);
        Intrinsics.checkNotNullExpressionValue(withValue2, "withValue(...)");
        arrayList.add(withValue2.build());
        ContentProviderOperation.Builder withValue3 = ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection(format, new String[]{this.contactId, "vnd.android.cursor.item/note"}).withValue(Columns.DATA, this.note);
        Intrinsics.checkNotNullExpressionValue(withValue3, "withValue(...)");
        arrayList.add(withValue3.build());
        withValue3.withYieldAllowed(true);
        String str = this.rawPhotoUri;
        if (str == null) {
            str = this.photoUri;
        }
        String str2 = str;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            Bitmap thumbnailBitmap = getThumbnailBitmap(str);
            arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection(format, new String[]{this.rawContactId, "vnd.android.cursor.item/photo"}).build());
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("raw_contact_id", this.rawContactId).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/photo").withValue("data15", toByteArray(thumbnailBitmap)).build());
        }
        ContentProviderOperation.Builder withValue4 = ContentProviderOperation.newUpdate(ContactsContract.Contacts.CONTENT_URI).withSelection("_id=?", new String[]{this.contactId}).withValue(Columns.STARRED, Integer.valueOf(this.isFavorite ? 1 : 0));
        Intrinsics.checkNotNullExpressionValue(withValue4, "withValue(...)");
        arrayList.add(withValue4.build());
        String str3 = this.rawContactId;
        if (str3 != null) {
            for (String str4 : getBaseModelsContentType()) {
                arrayList.add(getFlushOperation(str4, str3));
            }
        }
        for (List<BaseModel> list : getBaseModels()) {
            Iterator<BaseModel> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getInsertOperation(this.rawContactId));
            }
        }
        return arrayList;
    }

    private final ContentProviderOperation getFlushOperation(String contentType, String rawId) {
        ContentProviderOperation build = ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("mimetype=? AND raw_contact_id=?", new String[]{contentType, rawId}).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final List<BaseModel>[] getBaseModels() {
        return new List[]{this.dates, this.emails, this.imAddresses, this.phones, this.addresses, this.relationships, this.urlAddresses, this.extraNames};
    }

    private final String[] getBaseModelsContentType() {
        return new String[]{"vnd.android.cursor.item/contact_event", "vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/im", "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/postal-address_v2", "vnd.android.cursor.item/relation", "vnd.android.cursor.item/website", "vnd.android.cursor.item/nickname"};
    }

    public final Bundle toMap(Set<String> fieldSet) throws ParseException {
        Intrinsics.checkNotNullParameter(fieldSet, "fieldSet");
        Bundle bundle = new Bundle();
        bundle.putString("lookupKey", this.lookupKey);
        bundle.putString("id", this.contactId);
        String str = this.displayName;
        bundle.putString("name", (str == null || str.length() == 0) ? this.firstName + " " + this.lastName : this.displayName);
        String str2 = this.firstName;
        if (str2 != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                bundle.putString("firstName", str2);
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            }
        }
        String str3 = this.middleName;
        if (str3 != null) {
            if (str3.length() <= 0) {
                str3 = null;
            }
            if (str3 != null) {
                bundle.putString("middleName", str3);
                Unit unit3 = Unit.INSTANCE;
                Unit unit4 = Unit.INSTANCE;
            }
        }
        String str4 = this.lastName;
        if (str4 != null) {
            if (str4.length() <= 0) {
                str4 = null;
            }
            if (str4 != null) {
                bundle.putString("lastName", str4);
                Unit unit5 = Unit.INSTANCE;
                Unit unit6 = Unit.INSTANCE;
            }
        }
        String str5 = this.suffix;
        if (str5 != null) {
            if (str5.length() <= 0) {
                str5 = null;
            }
            if (str5 != null) {
                bundle.putString("nameSuffix", str5);
                Unit unit7 = Unit.INSTANCE;
                Unit unit8 = Unit.INSTANCE;
            }
        }
        String str6 = this.prefix;
        if (str6 != null) {
            if (str6.length() <= 0) {
                str6 = null;
            }
            if (str6 != null) {
                bundle.putString("namePrefix", str6);
                Unit unit9 = Unit.INSTANCE;
                Unit unit10 = Unit.INSTANCE;
            }
        }
        String str7 = this.phoneticFirstName;
        if (str7 != null) {
            if (str7.length() <= 0) {
                str7 = null;
            }
            if (str7 != null) {
                bundle.putString("phoneticFirstName", str7);
                Unit unit11 = Unit.INSTANCE;
                Unit unit12 = Unit.INSTANCE;
            }
        }
        String str8 = this.phoneticLastName;
        if (str8 != null) {
            if (str8.length() <= 0) {
                str8 = null;
            }
            if (str8 != null) {
                bundle.putString("phoneticLastName", str8);
                Unit unit13 = Unit.INSTANCE;
                Unit unit14 = Unit.INSTANCE;
            }
        }
        String str9 = this.phoneticMiddleName;
        if (str9 != null) {
            if (str9.length() <= 0) {
                str9 = null;
            }
            if (str9 != null) {
                bundle.putString("phoneticMiddleName", str9);
                Unit unit15 = Unit.INSTANCE;
                Unit unit16 = Unit.INSTANCE;
            }
        }
        bundle.putString("contactType", this.contactType);
        String str10 = this.company;
        if (str10 != null) {
            if (str10.length() <= 0) {
                str10 = null;
            }
            if (str10 != null) {
                bundle.putString("company", str10);
                Unit unit17 = Unit.INSTANCE;
                Unit unit18 = Unit.INSTANCE;
            }
        }
        String str11 = this.jobTitle;
        if (str11 != null) {
            if (str11.length() <= 0) {
                str11 = null;
            }
            if (str11 != null) {
                bundle.putString("jobTitle", str11);
                Unit unit19 = Unit.INSTANCE;
                Unit unit20 = Unit.INSTANCE;
            }
        }
        String str12 = this.department;
        if (str12 != null) {
            if (str12.length() <= 0) {
                str12 = null;
            }
            if (str12 != null) {
                bundle.putString("department", str12);
                Unit unit21 = Unit.INSTANCE;
                Unit unit22 = Unit.INSTANCE;
            }
        }
        bundle.putBoolean("imageAvailable", this.hasPhoto);
        bundle.putBoolean("isFavorite", this.isFavorite);
        if (fieldSet.contains("image") && this.photoUri != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("uri", this.photoUri);
            Unit unit23 = Unit.INSTANCE;
            bundle.putBundle("image", bundle2);
        }
        if (fieldSet.contains("rawImage") && this.rawPhotoUri != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("uri", this.rawPhotoUri);
            Unit unit24 = Unit.INSTANCE;
            bundle.putBundle("image", bundle3);
        }
        if (fieldSet.contains("note") && !TextUtils.isEmpty(this.note)) {
            bundle.putString("note", this.note);
        }
        if (fieldSet.contains("phoneNumbers") && this.phones.size() > 0) {
            List<PhoneNumberModel> list = this.phones;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((PhoneNumberModel) it.next()).getMap());
            }
            bundle.putParcelableArrayList("phoneNumbers", new ArrayList<>(arrayList));
        }
        if (fieldSet.contains("emails") && this.emails.size() > 0) {
            List<EmailModel> list2 = this.emails;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((EmailModel) it2.next()).getMap());
            }
            bundle.putParcelableArrayList("emails", new ArrayList<>(arrayList2));
        }
        if (fieldSet.contains("addresses") && this.addresses.size() > 0) {
            List<PostalAddressModel> list3 = this.addresses;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((PostalAddressModel) it3.next()).getMap());
            }
            bundle.putParcelableArrayList("addresses", new ArrayList<>(arrayList3));
        }
        if (fieldSet.contains("instantMessageAddresses") && this.imAddresses.size() > 0) {
            List<ImAddressModel> list4 = this.imAddresses;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator<T> it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList4.add(((ImAddressModel) it4.next()).getMap());
            }
            bundle.putParcelableArrayList("instantMessageAddresses", new ArrayList<>(arrayList4));
        }
        if (fieldSet.contains("urlAddresses") && this.urlAddresses.size() > 0) {
            List<UrlAddressModel> list5 = this.urlAddresses;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
            Iterator<T> it5 = list5.iterator();
            while (it5.hasNext()) {
                arrayList5.add(((UrlAddressModel) it5.next()).getMap());
            }
            bundle.putParcelableArrayList("urlAddresses", new ArrayList<>(arrayList5));
        }
        if (fieldSet.contains("relationships") && this.relationships.size() > 0) {
            List<RelationshipModel> list6 = this.relationships;
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
            Iterator<T> it6 = list6.iterator();
            while (it6.hasNext()) {
                arrayList6.add(((RelationshipModel) it6.next()).getMap());
            }
            bundle.putParcelableArrayList("relationships", new ArrayList<>(arrayList6));
        }
        boolean z = false;
        if (this.extraNames.size() > 0) {
            boolean contains = fieldSet.contains("nickname");
            boolean contains2 = fieldSet.contains("maidenName");
            int size = this.extraNames.size();
            for (int i = 0; i < size; i++) {
                ExtraNameModel extraNameModel = this.extraNames.get(i);
                String data = extraNameModel.getData();
                String label = extraNameModel.getLabel();
                if (contains2 && label != null && Intrinsics.areEqual(label, "maidenName") && !TextUtils.isEmpty(data)) {
                    bundle.putString(label, data);
                }
                if (contains && label != null && Intrinsics.areEqual(label, "nickname") && !TextUtils.isEmpty(data)) {
                    bundle.putString(label, data);
                }
            }
        }
        boolean contains3 = fieldSet.contains(DateModelKt.BIRTHDAY);
        boolean contains4 = fieldSet.contains("dates");
        if (contains4 || contains3) {
            ArrayList<? extends Parcelable> arrayList7 = new ArrayList<>();
            ArrayList<? extends Parcelable> arrayList8 = new ArrayList<>();
            for (DateModel dateModel : this.dates) {
                Calendar calendar = Calendar.getInstance();
                Bundle bundle4 = new Bundle();
                String data2 = dateModel.getData();
                String label2 = dateModel.getLabel();
                Bundle bundle5 = new Bundle();
                bundle5.putString("type", label2);
                bundle5.putString("value", data2);
                arrayList7.add(bundle5);
                try {
                    Intrinsics.checkNotNull(data2);
                    boolean startsWith$default = StringsKt.startsWith$default(data2, "--", z, 2, (Object) null);
                    if (!startsWith$default) {
                        Date parse = new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(data2);
                        Intrinsics.checkNotNull(parse);
                        calendar.setTime(parse);
                    } else {
                        Date parse2 = new SimpleDateFormat("--MM-dd", Locale.US).parse(data2);
                        Intrinsics.checkNotNull(parse2);
                        calendar.setTime(parse2);
                    }
                    if (!startsWith$default) {
                        bundle4.putInt("year", calendar.get(1));
                    }
                    bundle4.putInt("month", calendar.get(2));
                    bundle4.putInt("day", calendar.get(5));
                    bundle4.putString("format", LocalePreferences.CalendarType.GREGORIAN);
                    if (contains3 && label2 != null && Intrinsics.areEqual(label2, DateModelKt.BIRTHDAY)) {
                        bundle.putBundle(DateModelKt.BIRTHDAY, bundle4);
                        Unit unit25 = Unit.INSTANCE;
                    } else {
                        bundle4.putString("label", label2);
                        Boolean.valueOf(arrayList8.add(bundle4));
                    }
                } catch (Exception e) {
                    Integer.valueOf(Log.w(AppEventsConstants.EVENT_NAME_CONTACT, e.toString()));
                }
                z = false;
            }
            if (contains4 && arrayList8.size() > 0) {
                bundle.putParcelableArrayList("dates", arrayList8);
            }
            if (arrayList7.size() > 0) {
                bundle.putParcelableArrayList("rawDates", arrayList7);
            }
        }
        return bundle;
    }

    public final ArrayList<ContentValues> getContentValues() {
        ArrayList<ContentValues> arrayList = new ArrayList<>();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Columns.MIMETYPE, "vnd.android.cursor.item/identity");
        contentValues.put(Columns.TYPE, this.firstName);
        contentValues.put(Columns.DATA_5, this.middleName);
        contentValues.put(Columns.LABEL, this.lastName);
        contentValues.put(Columns.DATA_4, this.prefix);
        contentValues.put(Columns.DATA_6, this.suffix);
        contentValues.put(Columns.DATA_7, this.phoneticFirstName);
        contentValues.put(Columns.DATA_8, this.phoneticMiddleName);
        contentValues.put(Columns.DATA_9, this.phoneticLastName);
        arrayList.add(contentValues);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(Columns.MIMETYPE, "vnd.android.cursor.item/organization");
        contentValues2.put(Columns.DATA, this.company);
        contentValues2.put(Columns.DATA_4, this.jobTitle);
        contentValues2.put(Columns.DATA_5, this.department);
        arrayList.add(contentValues2);
        ContentValues contentValues3 = new ContentValues();
        contentValues3.put(Columns.MIMETYPE, "vnd.android.cursor.item/note");
        contentValues3.put(Columns.DATA, this.note);
        arrayList.add(contentValues3);
        String str = this.photoUri;
        String str2 = str;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            Bitmap thumbnailBitmap = getThumbnailBitmap(str);
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put(Columns.MIMETYPE, "vnd.android.cursor.item/photo");
            contentValues4.put("data15", toByteArray(thumbnailBitmap));
            arrayList.add(contentValues4);
        }
        String str3 = this.rawPhotoUri;
        String str4 = str3;
        if (str4 != null && !StringsKt.isBlank(str4)) {
            Bitmap thumbnailBitmap2 = getThumbnailBitmap(str3);
            ContentValues contentValues5 = new ContentValues();
            contentValues5.put(Columns.MIMETYPE, "vnd.android.cursor.item/photo");
            contentValues5.put("data15", toByteArray(thumbnailBitmap2));
            arrayList.add(contentValues5);
        }
        ContentValues contentValues6 = new ContentValues();
        contentValues6.put("isFavorite", Integer.valueOf(this.isFavorite ? 1 : 0));
        arrayList.add(contentValues6);
        for (List<BaseModel> list : getBaseModels()) {
            Iterator<BaseModel> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getContentValues());
            }
        }
        return arrayList;
    }

    private final Bitmap getThumbnailBitmap(String photoUri) {
        Context reactContext = this.appContext.getReactContext();
        if (reactContext == null) {
            throw new Exceptions.ReactContextLost();
        }
        InputStream openInputStream = reactContext.getContentResolver().openInputStream(Uri.parse(photoUri));
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
            Intrinsics.checkNotNullExpressionValue(decodeStream, "decodeStream(...)");
            CloseableKt.closeFinally(openInputStream, null);
            return decodeStream;
        } finally {
        }
    }
}
