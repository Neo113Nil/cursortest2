package com.smaato.sdk.ng.vpaid.helpers;

import android.content.Context;
import com.smaato.sdk.ng.models.EndCardData;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.vpaid.PlayerInfo;
import com.smaato.sdk.ng.vpaid.enums.VastError;
import com.smaato.sdk.ng.vpaid.helpers.FileLoader;
import com.smaato.sdk.ng.vpaid.response.AdParams;
import java.util.Locale;

/* loaded from: classes10.dex */
public class AssetsLoader {
    private static final String i = "AssetsLoader";
    private OnAssetsLoaded a;
    private FileLoader b;
    private FileLoader c;
    private AdParams d;
    private Context e;
    private int f;
    private int g;
    private String h;

    public interface OnAssetsLoaded {
        void onAssetsLoaded(String str, EndCardData endCardData, String str2);

        void onError(PlayerInfo playerInfo);
    }

    class a implements FileLoader.Callback {
        a() {
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.FileLoader.Callback
        public void onError(PlayerInfo playerInfo) {
            Logger.e(AssetsLoader.i, "Load video fail:" + playerInfo.getMessage());
            AssetsLoader assetsLoader = AssetsLoader.this;
            int i = assetsLoader.f + 1;
            assetsLoader.f = i;
            if (i < assetsLoader.d.getVideoFileUrlsList().size()) {
                AssetsLoader.this.b();
            } else {
                AssetsLoader.this.a.onError(playerInfo);
            }
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.FileLoader.Callback
        public void onFileLoaded(String str) {
            Logger.d(AssetsLoader.i, "onFullVideoLoaded");
            AssetsLoader assetsLoader = AssetsLoader.this;
            assetsLoader.h = str;
            assetsLoader.a();
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.FileLoader.Callback
        public void onProgress(double d) {
            Logger.d(AssetsLoader.i, String.format(Locale.US, "Loaded: %.2f%%", Double.valueOf(d * 100.0d)));
        }
    }

    class b implements FileLoader.Callback {
        final /* synthetic */ EndCardData a;

        b(EndCardData endCardData) {
            this.a = endCardData;
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.FileLoader.Callback
        public void onError(PlayerInfo playerInfo) {
            ErrorLog.postError(AssetsLoader.this.e, VastError.COMPANION);
            int size = AssetsLoader.this.d.getEndCardList().size();
            AssetsLoader assetsLoader = AssetsLoader.this;
            if (assetsLoader.g >= size) {
                assetsLoader.g = size - 1;
            }
            int i = assetsLoader.g;
            if (i < 0 || size <= i) {
                assetsLoader.a.onAssetsLoaded(assetsLoader.h, null, null);
                return;
            }
            assetsLoader.d.getEndCardList().remove(AssetsLoader.this.g);
            r3.g--;
            AssetsLoader.this.a();
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.FileLoader.Callback
        public void onFileLoaded(String str) {
            AssetsLoader assetsLoader = AssetsLoader.this;
            assetsLoader.a.onAssetsLoaded(assetsLoader.h, this.a, str);
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.FileLoader.Callback
        public void onProgress(double d) {
            Logger.d(AssetsLoader.i, String.format(Locale.US, "Loaded: %.2f%%", Double.valueOf(d * 100.0d)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.d.getEndCardList() == null || this.d.getEndCardList().isEmpty()) {
            this.a.onAssetsLoaded(this.h, null, null);
            return;
        }
        this.g = this.d.getEndCardList().size() - 1;
        EndCardData endCardData = this.d.getEndCardList().get(this.g);
        if (endCardData == null || endCardData.getType() != EndCardData.Type.STATIC_RESOURCE) {
            this.a.onAssetsLoaded(this.h, endCardData, null);
            return;
        }
        FileLoader fileLoader = new FileLoader(endCardData.getContent(), this.e, new b(endCardData), Boolean.TRUE);
        this.c = fileLoader;
        fileLoader.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.d.getVideoFileUrlsList() == null || this.d.getVideoFileUrlsList().isEmpty()) {
            this.a.onError(new PlayerInfo("No video file found"));
            return;
        }
        FileLoader fileLoader = new FileLoader(this.d.getVideoFileUrlsList().get(this.f), this.e, new a(), Boolean.FALSE);
        this.b = fileLoader;
        fileLoader.start();
    }

    public void breakLoading() {
        FileLoader fileLoader = this.b;
        if (fileLoader != null) {
            fileLoader.stop();
        }
        FileLoader fileLoader2 = this.c;
        if (fileLoader2 != null) {
            fileLoader2.stop();
        }
    }

    public void load(AdParams adParams, Context context, OnAssetsLoaded onAssetsLoaded) {
        this.e = context;
        this.d = adParams;
        this.a = onAssetsLoaded;
        this.f = 0;
        this.g = 0;
        this.h = null;
        FileLoader.setUseMobileNetworkForCaching(true);
        if (adParams.isVpaid()) {
            a();
        } else {
            b();
        }
    }
}
