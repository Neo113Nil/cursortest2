package com.devanos.nilufar.usmonova.p7.data.network;

import com.devanos.nilufar.usmonova.p7.data.network.dto.ClickPayloadDto;
import com.devanos.nilufar.usmonova.p7.data.network.dto.PersistPayloadDto;
import com.devanos.nilufar.usmonova.p7.data.network.dto.PushPayloadDto;
import com.devanos.nilufar.usmonova.p7.data.network.dto.StartupResponseDto;
import kotlin.Metadata;
import o.C0782bY;
import o.InterfaceC2235xe;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jt\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0019\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0018H§@¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lcom/devanos/nilufar/usmonova/p7/data/network/ApiService;", "", "", "ep", "locale", "country", "model", "manufacturer", "screenWidth", "screenHeight", "installId", "idfv", "appVersion", "Lcom/devanos/nilufar/usmonova/p7/data/network/dto/StartupResponseDto;", "startup", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/xe;)Ljava/lang/Object;", "Lcom/devanos/nilufar/usmonova/p7/data/network/dto/PersistPayloadDto;", "body", "Lo/bY;", "postPersist", "(Ljava/lang/String;Lcom/devanos/nilufar/usmonova/p7/data/network/dto/PersistPayloadDto;Lo/xe;)Ljava/lang/Object;", "Lcom/devanos/nilufar/usmonova/p7/data/network/dto/PushPayloadDto;", "postPush", "(Ljava/lang/String;Lcom/devanos/nilufar/usmonova/p7/data/network/dto/PushPayloadDto;Lo/xe;)Ljava/lang/Object;", "Lcom/devanos/nilufar/usmonova/p7/data/network/dto/ClickPayloadDto;", "postClick", "(Ljava/lang/String;Lcom/devanos/nilufar/usmonova/p7/data/network/dto/ClickPayloadDto;Lo/xe;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ApiService {
    @POST("{ep}")
    Object postClick(@Path("ep") String str, @Body ClickPayloadDto clickPayloadDto, InterfaceC2235xe<? super C0782bY> interfaceC2235xe);

    @POST("{ep}")
    Object postPersist(@Path("ep") String str, @Body PersistPayloadDto persistPayloadDto, InterfaceC2235xe<? super C0782bY> interfaceC2235xe);

    @POST("{ep}")
    Object postPush(@Path("ep") String str, @Body PushPayloadDto pushPayloadDto, InterfaceC2235xe<? super C0782bY> interfaceC2235xe);

    @GET("{ep}")
    Object startup(@Path("ep") String str, @Query("b8q2la") String str2, @Query("c5v7nk") String str3, @Query("x2m9td") String str4, @Query("h7p4wy") String str5, @Query("s3u8ej") String str6, @Query("f6d2lp") String str7, @Query("g9n4zr") String str8, @Query("c2h8vn") String str9, @Query("j5a9kf") String str10, InterfaceC2235xe<? super StartupResponseDto> interfaceC2235xe);
}
