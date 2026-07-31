package io.intercom.android.sdk.api;

import androidx.media3.extractor.text.ttml.TtmlNode;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Url;

/* compiled from: ExternalUploadApi.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b`\u0018\u00002\u00020\u0001Jz\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\bH§@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/api/ExternalUploadApi;", "", "uploadFileSuspended", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "", "url", "", "key", "Lokhttp3/MultipartBody$Part;", "acl", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_CONTENT_TYPE_KEY, "accessKey", "policy", "signature", "successActionStatus", TtmlNode.TAG_METADATA, "filePart", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ExternalUploadApi {
    @POST
    @Multipart
    Object uploadFileSuspended(@Url String str, @Part MultipartBody.Part part, @Part MultipartBody.Part part2, @Part MultipartBody.Part part3, @Part MultipartBody.Part part4, @Part MultipartBody.Part part5, @Part MultipartBody.Part part6, @Part MultipartBody.Part part7, @Part MultipartBody.Part part8, @Part MultipartBody.Part part9, Continuation<? super NetworkResponse<Unit>> continuation);
}
