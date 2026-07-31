package io.intercom.android.sdk.helpcenter.collections;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: HelpCenterCollection.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002/0B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J;\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010%\u001a\u00020\u0007H×\u0001J\t\u0010&\u001a\u00020\u0003H×\u0001J%\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0001¢\u0006\u0002\b.R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0019¨\u00061"}, d2 = {"Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection;", "", "summary", "", "id", "title", "articlesCount", "", "collectionsCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSummary$annotations", "()V", "getSummary", "()Ljava/lang/String;", "getId$annotations", "getId", "getTitle$annotations", "getTitle", "getArticlesCount$annotations", "getArticlesCount", "()I", "getCollectionsCount$annotations", "getCollectionsCount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$intercom_sdk_base_release", "$serializer", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes8.dex */
public final /* data */ class HelpCenterCollection {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int articlesCount;
    private final int collectionsCount;
    private final String id;
    private final String summary;
    private final String title;

    public static /* synthetic */ HelpCenterCollection copy$default(HelpCenterCollection helpCenterCollection, String str, String str2, String str3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = helpCenterCollection.summary;
        }
        if ((i3 & 2) != 0) {
            str2 = helpCenterCollection.id;
        }
        if ((i3 & 4) != 0) {
            str3 = helpCenterCollection.title;
        }
        if ((i3 & 8) != 0) {
            i = helpCenterCollection.articlesCount;
        }
        if ((i3 & 16) != 0) {
            i2 = helpCenterCollection.collectionsCount;
        }
        int i4 = i2;
        String str4 = str3;
        return helpCenterCollection.copy(str, str2, str4, i, i4);
    }

    @SerialName("article_count")
    public static /* synthetic */ void getArticlesCount$annotations() {
    }

    @SerialName("collection_count")
    public static /* synthetic */ void getCollectionsCount$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("description")
    public static /* synthetic */ void getSummary$annotations() {
    }

    @SerialName("name")
    public static /* synthetic */ void getTitle$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final int getArticlesCount() {
        return this.articlesCount;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCollectionsCount() {
        return this.collectionsCount;
    }

    public final HelpCenterCollection copy(String summary, String id, String title, int articlesCount, int collectionsCount) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        return new HelpCenterCollection(summary, id, title, articlesCount, collectionsCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HelpCenterCollection)) {
            return false;
        }
        HelpCenterCollection helpCenterCollection = (HelpCenterCollection) other;
        return Intrinsics.areEqual(this.summary, helpCenterCollection.summary) && Intrinsics.areEqual(this.id, helpCenterCollection.id) && Intrinsics.areEqual(this.title, helpCenterCollection.title) && this.articlesCount == helpCenterCollection.articlesCount && this.collectionsCount == helpCenterCollection.collectionsCount;
    }

    public int hashCode() {
        return (((((((this.summary.hashCode() * 31) + this.id.hashCode()) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.articlesCount)) * 31) + Integer.hashCode(this.collectionsCount);
    }

    public String toString() {
        return "HelpCenterCollection(summary=" + this.summary + ", id=" + this.id + ", title=" + this.title + ", articlesCount=" + this.articlesCount + ", collectionsCount=" + this.collectionsCount + ')';
    }

    /* compiled from: HelpCenterCollection.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HelpCenterCollection> serializer() {
            return HelpCenterCollection$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HelpCenterCollection(int i, String str, String str2, String str3, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, HelpCenterCollection$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.summary = "";
        } else {
            this.summary = str;
        }
        this.id = str2;
        if ((i & 4) == 0) {
            this.title = "";
        } else {
            this.title = str3;
        }
        if ((i & 8) == 0) {
            this.articlesCount = 0;
        } else {
            this.articlesCount = i2;
        }
        if ((i & 16) == 0) {
            this.collectionsCount = 0;
        } else {
            this.collectionsCount = i3;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterCollection self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.summary, "")) {
            output.encodeStringElement(serialDesc, 0, self.summary);
        }
        output.encodeStringElement(serialDesc, 1, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.title, "")) {
            output.encodeStringElement(serialDesc, 2, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.articlesCount != 0) {
            output.encodeIntElement(serialDesc, 3, self.articlesCount);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.collectionsCount == 0) {
            return;
        }
        output.encodeIntElement(serialDesc, 4, self.collectionsCount);
    }

    public HelpCenterCollection(String summary, String id, String title, int i, int i2) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.summary = summary;
        this.id = id;
        this.title = title;
        this.articlesCount = i;
        this.collectionsCount = i2;
    }

    public /* synthetic */ HelpCenterCollection(String str, String str2, String str3, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getArticlesCount() {
        return this.articlesCount;
    }

    public final int getCollectionsCount() {
        return this.collectionsCount;
    }
}
