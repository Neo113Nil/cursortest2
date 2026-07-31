package expo.modules.imagepicker;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.imagepipeline.common.RotationOptions;
import expo.modules.imagepicker.exporters.CompressionImageExporter;
import expo.modules.imagepicker.exporters.ImageExportResult;
import expo.modules.imagepicker.exporters.RawImageExporter;
import expo.modules.kotlin.providers.AppContextProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: MediaHandler.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\n\u001a\u00020\u000b2\u001e\u0010\f\u001a\u001a\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\rj\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0080@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u0010H\u0002J\u0016\u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006#"}, d2 = {"Lexpo/modules/imagepicker/MediaHandler;", "", "appContextProvider", "Lexpo/modules/kotlin/providers/AppContextProvider;", "<init>", "(Lexpo/modules/kotlin/providers/AppContextProvider;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "readExtras", "Lexpo/modules/imagepicker/ImagePickerResponse;", "bareResult", "", "Lkotlin/Pair;", "Lexpo/modules/imagepicker/MediaType;", "Landroid/net/Uri;", "Lexpo/modules/imagepicker/contracts/MediaList;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lexpo/modules/imagepicker/ImagePickerOptions;", "readExtras$expo_image_picker_release", "(Ljava/util/List;Lexpo/modules/imagepicker/ImagePickerOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cacheDirectory", "Ljava/io/File;", "getCacheDirectory", "()Ljava/io/File;", "handleImage", "Lexpo/modules/imagepicker/ImagePickerAsset;", "sourceUri", "(Landroid/net/Uri;Lexpo/modules/imagepicker/ImagePickerOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAdditionalFileData", "Lexpo/modules/imagepicker/AdditionalFileData;", "uri", "handleVideo", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediaHandler {
    private final AppContextProvider appContextProvider;

    /* compiled from: MediaHandler.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaType.values().length];
            try {
                iArr[MediaType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaType.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MediaHandler(AppContextProvider appContextProvider) {
        Intrinsics.checkNotNullParameter(appContextProvider, "appContextProvider");
        this.appContextProvider = appContextProvider;
    }

    private final Context getContext() {
        Context reactContext = this.appContextProvider.getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new IllegalArgumentException("React Application Context is null".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b6 -> B:11:0x00b9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d9 -> B:12:0x0100). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readExtras$expo_image_picker_release(List<? extends Pair<? extends MediaType, ? extends Uri>> list, ImagePickerOptions imagePickerOptions, Continuation<? super ImagePickerResponse> continuation) {
        MediaHandler$readExtras$1 mediaHandler$readExtras$1;
        int i;
        ArrayList arrayList;
        Iterator it;
        ImagePickerOptions imagePickerOptions2;
        ImagePickerOptions imagePickerOptions3;
        Collection collection;
        ImagePickerAsset imagePickerAsset;
        if (continuation instanceof MediaHandler$readExtras$1) {
            mediaHandler$readExtras$1 = (MediaHandler$readExtras$1) continuation;
            if ((mediaHandler$readExtras$1.label & Integer.MIN_VALUE) != 0) {
                mediaHandler$readExtras$1.label -= Integer.MIN_VALUE;
                Object obj = mediaHandler$readExtras$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mediaHandler$readExtras$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    List<? extends Pair<? extends MediaType, ? extends Uri>> list2 = list;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    it = list2.iterator();
                    imagePickerOptions2 = imagePickerOptions;
                    if (!it.hasNext()) {
                    }
                } else if (i == 1) {
                    arrayList = (Collection) mediaHandler$readExtras$1.L$3;
                    it = (Iterator) mediaHandler$readExtras$1.L$2;
                    collection = (Collection) mediaHandler$readExtras$1.L$1;
                    imagePickerOptions3 = (ImagePickerOptions) mediaHandler$readExtras$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    imagePickerAsset = (ImagePickerAsset) obj;
                    arrayList.add(imagePickerAsset);
                    arrayList = collection;
                    imagePickerOptions2 = imagePickerOptions3;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList = (Collection) mediaHandler$readExtras$1.L$3;
                    it = (Iterator) mediaHandler$readExtras$1.L$2;
                    collection = (Collection) mediaHandler$readExtras$1.L$1;
                    imagePickerOptions3 = (ImagePickerOptions) mediaHandler$readExtras$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    imagePickerAsset = (ImagePickerAsset) obj;
                    arrayList.add(imagePickerAsset);
                    arrayList = collection;
                    imagePickerOptions2 = imagePickerOptions3;
                    if (!it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        MediaType mediaType = (MediaType) pair.component1();
                        Uri uri = (Uri) pair.component2();
                        int i2 = mediaType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[mediaType.ordinal()];
                        if (i2 != -1) {
                            if (i2 == 1) {
                                mediaHandler$readExtras$1.L$0 = imagePickerOptions2;
                                mediaHandler$readExtras$1.L$1 = arrayList;
                                mediaHandler$readExtras$1.L$2 = it;
                                mediaHandler$readExtras$1.L$3 = arrayList;
                                mediaHandler$readExtras$1.label = 1;
                                Object handleVideo = handleVideo(uri, mediaHandler$readExtras$1);
                                if (handleVideo != coroutine_suspended) {
                                    imagePickerOptions3 = imagePickerOptions2;
                                    collection = arrayList;
                                    imagePickerAsset = (ImagePickerAsset) handleVideo;
                                }
                            } else {
                                if (i2 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                mediaHandler$readExtras$1.L$0 = imagePickerOptions2;
                                mediaHandler$readExtras$1.L$1 = arrayList;
                                mediaHandler$readExtras$1.L$2 = it;
                                mediaHandler$readExtras$1.L$3 = arrayList;
                                mediaHandler$readExtras$1.label = 2;
                                Object handleImage = handleImage(uri, imagePickerOptions2, mediaHandler$readExtras$1);
                                if (handleImage != coroutine_suspended) {
                                    imagePickerOptions3 = imagePickerOptions2;
                                    obj = handleImage;
                                    collection = arrayList;
                                    imagePickerAsset = (ImagePickerAsset) obj;
                                }
                            }
                            return coroutine_suspended;
                        }
                        String uri2 = uri.toString();
                        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                        imagePickerOptions3 = imagePickerOptions2;
                        collection = arrayList;
                        imagePickerAsset = new ImagePickerAsset(null, null, uri2, 0, 0, null, null, null, null, null, null, null, 4089, null);
                        arrayList.add(imagePickerAsset);
                        arrayList = collection;
                        imagePickerOptions2 = imagePickerOptions3;
                        if (!it.hasNext()) {
                            return new ImagePickerResponse(false, (List) arrayList);
                        }
                    }
                }
            }
        }
        mediaHandler$readExtras$1 = new MediaHandler$readExtras$1(this, continuation);
        Object obj2 = mediaHandler$readExtras$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mediaHandler$readExtras$1.label;
        if (i != 0) {
        }
    }

    private final File getCacheDirectory() {
        return this.appContextProvider.getAppContext().getCacheDirectory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleImage(Uri uri, ImagePickerOptions imagePickerOptions, Continuation<? super ImagePickerAsset> continuation) {
        MediaHandler$handleImage$1 mediaHandler$handleImage$1;
        int i;
        CompressionImageExporter compressionImageExporter;
        ImagePickerOptions imagePickerOptions2;
        String str;
        File file;
        ImageExportResult imageExportResult;
        Boolean boxBoolean;
        Uri uri2;
        ImageExportResult imageExportResult2;
        ImagePickerOptions imagePickerOptions3;
        String str2;
        Boolean boxBoolean2;
        String str3;
        ImageExportResult imageExportResult3;
        String str4;
        Uri uri3;
        ByteArrayOutputStream byteArrayOutputStream;
        AdditionalFileData additionalFileData;
        Long fileSize;
        Uri uri4 = uri;
        if (continuation instanceof MediaHandler$handleImage$1) {
            mediaHandler$handleImage$1 = (MediaHandler$handleImage$1) continuation;
            if ((mediaHandler$handleImage$1.label & Integer.MIN_VALUE) != 0) {
                mediaHandler$handleImage$1.label -= Integer.MIN_VALUE;
                Object obj = mediaHandler$handleImage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mediaHandler$handleImage$1.label;
                Bundle bundle = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (imagePickerOptions.getQuality() == 1.0d) {
                        compressionImageExporter = new RawImageExporter();
                    } else {
                        compressionImageExporter = new CompressionImageExporter(this.appContextProvider, imagePickerOptions.getQuality());
                    }
                    ContentResolver contentResolver = getContext().getContentResolver();
                    Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
                    String type = ImagePickerUtilsKt.getType(contentResolver, uri4);
                    if (type == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    File createOutputFile = ImagePickerUtilsKt.createOutputFile(getCacheDirectory(), ImagePickerUtilsKt.toImageFileExtension(type));
                    ContentResolver contentResolver2 = getContext().getContentResolver();
                    Intrinsics.checkNotNullExpressionValue(contentResolver2, "getContentResolver(...)");
                    mediaHandler$handleImage$1.L$0 = uri4;
                    imagePickerOptions2 = imagePickerOptions;
                    mediaHandler$handleImage$1.L$1 = imagePickerOptions2;
                    mediaHandler$handleImage$1.L$2 = type;
                    mediaHandler$handleImage$1.L$3 = createOutputFile;
                    mediaHandler$handleImage$1.label = 1;
                    obj = compressionImageExporter.exportAsync(uri4, createOutputFile, contentResolver2, mediaHandler$handleImage$1);
                    if (obj != coroutine_suspended) {
                        str = type;
                        file = createOutputFile;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    File file2 = (File) mediaHandler$handleImage$1.L$3;
                    String str5 = (String) mediaHandler$handleImage$1.L$2;
                    ImagePickerOptions imagePickerOptions4 = (ImagePickerOptions) mediaHandler$handleImage$1.L$1;
                    Uri uri5 = (Uri) mediaHandler$handleImage$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    imagePickerOptions2 = imagePickerOptions4;
                    str = str5;
                    file = file2;
                    uri4 = uri5;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = (String) mediaHandler$handleImage$1.L$4;
                        imageExportResult3 = (ImageExportResult) mediaHandler$handleImage$1.L$3;
                        file = (File) mediaHandler$handleImage$1.L$2;
                        str4 = (String) mediaHandler$handleImage$1.L$1;
                        uri3 = (Uri) mediaHandler$handleImage$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        bundle = (Bundle) obj;
                        uri2 = uri3;
                        imageExportResult = imageExportResult3;
                        str3 = str4;
                        String str6 = str2;
                        Bundle bundle2 = bundle;
                        additionalFileData = getAdditionalFileData(uri2);
                        MediaType mediaType = MediaType.IMAGE;
                        String uri6 = Uri.fromFile(file).toString();
                        Intrinsics.checkNotNullExpressionValue(uri6, "toString(...)");
                        int width = imageExportResult.getWidth();
                        int height = imageExportResult.getHeight();
                        if (additionalFileData != null || (r2 = additionalFileData.getFileName()) == null) {
                            String name = file.getName();
                        }
                        return new ImagePickerAsset(ImagePickerUtilsKt.getMediaStoreAssetId(uri2), mediaType, uri6, width, height, name, Boxing.boxLong((additionalFileData != null || (fileSize = additionalFileData.getFileSize()) == null) ? file.length() : fileSize.longValue()), str3, str6, bundle2, null, null, 3072, null);
                    }
                    imageExportResult2 = (ImageExportResult) mediaHandler$handleImage$1.L$4;
                    file = (File) mediaHandler$handleImage$1.L$3;
                    str = (String) mediaHandler$handleImage$1.L$2;
                    imagePickerOptions3 = (ImagePickerOptions) mediaHandler$handleImage$1.L$1;
                    uri2 = (Uri) mediaHandler$handleImage$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    byteArrayOutputStream = (ByteArrayOutputStream) obj;
                    if (byteArrayOutputStream == null) {
                        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                        imageExportResult = imageExportResult2;
                        str2 = encodeToString;
                        boxBoolean2 = Boxing.boxBoolean(imagePickerOptions3.getExif());
                        if (!boxBoolean2.booleanValue()) {
                            boxBoolean2 = null;
                        }
                        if (boxBoolean2 == null) {
                            boxBoolean2.booleanValue();
                            ContentResolver contentResolver3 = getContext().getContentResolver();
                            Intrinsics.checkNotNullExpressionValue(contentResolver3, "getContentResolver(...)");
                            mediaHandler$handleImage$1.L$0 = uri2;
                            mediaHandler$handleImage$1.L$1 = str;
                            mediaHandler$handleImage$1.L$2 = file;
                            mediaHandler$handleImage$1.L$3 = imageExportResult;
                            mediaHandler$handleImage$1.L$4 = str2;
                            mediaHandler$handleImage$1.label = 3;
                            Object exif = imageExportResult.exif(contentResolver3, mediaHandler$handleImage$1);
                            if (exif != coroutine_suspended) {
                                imageExportResult3 = imageExportResult;
                                obj = exif;
                                str4 = str;
                                uri3 = uri2;
                                bundle = (Bundle) obj;
                                uri2 = uri3;
                                imageExportResult = imageExportResult3;
                                str3 = str4;
                                String str62 = str2;
                                Bundle bundle22 = bundle;
                                additionalFileData = getAdditionalFileData(uri2);
                                MediaType mediaType2 = MediaType.IMAGE;
                                String uri62 = Uri.fromFile(file).toString();
                                Intrinsics.checkNotNullExpressionValue(uri62, "toString(...)");
                                int width2 = imageExportResult.getWidth();
                                int height2 = imageExportResult.getHeight();
                                if (additionalFileData != null) {
                                }
                                String name2 = file.getName();
                                return new ImagePickerAsset(ImagePickerUtilsKt.getMediaStoreAssetId(uri2), mediaType2, uri62, width2, height2, name2, Boxing.boxLong((additionalFileData != null || (fileSize = additionalFileData.getFileSize()) == null) ? file.length() : fileSize.longValue()), str3, str62, bundle22, null, null, 3072, null);
                            }
                            return coroutine_suspended;
                        }
                        str3 = str;
                        String str622 = str2;
                        Bundle bundle222 = bundle;
                        additionalFileData = getAdditionalFileData(uri2);
                        MediaType mediaType22 = MediaType.IMAGE;
                        String uri622 = Uri.fromFile(file).toString();
                        Intrinsics.checkNotNullExpressionValue(uri622, "toString(...)");
                        int width22 = imageExportResult.getWidth();
                        int height22 = imageExportResult.getHeight();
                        if (additionalFileData != null) {
                        }
                        String name22 = file.getName();
                        return new ImagePickerAsset(ImagePickerUtilsKt.getMediaStoreAssetId(uri2), mediaType22, uri622, width22, height22, name22, Boxing.boxLong((additionalFileData != null || (fileSize = additionalFileData.getFileSize()) == null) ? file.length() : fileSize.longValue()), str3, str622, bundle222, null, null, 3072, null);
                    }
                    imageExportResult = imageExportResult2;
                    imagePickerOptions2 = imagePickerOptions3;
                    uri4 = uri2;
                    uri2 = uri4;
                    str2 = null;
                    imagePickerOptions3 = imagePickerOptions2;
                    boxBoolean2 = Boxing.boxBoolean(imagePickerOptions3.getExif());
                    if (!boxBoolean2.booleanValue()) {
                    }
                    if (boxBoolean2 == null) {
                    }
                }
                imageExportResult = (ImageExportResult) obj;
                boxBoolean = Boxing.boxBoolean(imagePickerOptions2.getBase64());
                if (!boxBoolean.booleanValue()) {
                    boxBoolean = null;
                }
                if (boxBoolean != null) {
                    boxBoolean.booleanValue();
                    ContentResolver contentResolver4 = getContext().getContentResolver();
                    Intrinsics.checkNotNullExpressionValue(contentResolver4, "getContentResolver(...)");
                    mediaHandler$handleImage$1.L$0 = uri4;
                    mediaHandler$handleImage$1.L$1 = imagePickerOptions2;
                    mediaHandler$handleImage$1.L$2 = str;
                    mediaHandler$handleImage$1.L$3 = file;
                    mediaHandler$handleImage$1.L$4 = imageExportResult;
                    mediaHandler$handleImage$1.label = 2;
                    Object data = imageExportResult.data(contentResolver4, mediaHandler$handleImage$1);
                    if (data != coroutine_suspended) {
                        uri2 = uri4;
                        imageExportResult2 = imageExportResult;
                        obj = data;
                        imagePickerOptions3 = imagePickerOptions2;
                        byteArrayOutputStream = (ByteArrayOutputStream) obj;
                        if (byteArrayOutputStream == null) {
                        }
                    }
                    return coroutine_suspended;
                }
                uri2 = uri4;
                str2 = null;
                imagePickerOptions3 = imagePickerOptions2;
                boxBoolean2 = Boxing.boxBoolean(imagePickerOptions3.getExif());
                if (!boxBoolean2.booleanValue()) {
                }
                if (boxBoolean2 == null) {
                }
            }
        }
        mediaHandler$handleImage$1 = new MediaHandler$handleImage$1(this, continuation);
        Object obj2 = mediaHandler$handleImage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mediaHandler$handleImage$1.label;
        Bundle bundle3 = null;
        if (i != 0) {
        }
        imageExportResult = (ImageExportResult) obj2;
        boxBoolean = Boxing.boxBoolean(imagePickerOptions2.getBase64());
        if (!boxBoolean.booleanValue()) {
        }
        if (boxBoolean != null) {
        }
        uri2 = uri4;
        str2 = null;
        imagePickerOptions3 = imagePickerOptions2;
        boxBoolean2 = Boxing.boxBoolean(imagePickerOptions3.getExif());
        if (!boxBoolean2.booleanValue()) {
        }
        if (boxBoolean2 == null) {
        }
    }

    private final AdditionalFileData getAdditionalFileData(Uri uri) {
        Object m12363constructorimpl;
        Cursor query = getContext().getContentResolver().query(uri, (String[]) CollectionsKt.listOf((Object[]) new String[]{"_display_name", "_size"}).toArray(new String[0]), null, null, null);
        if (query == null) {
            return null;
        }
        Cursor cursor = query;
        try {
            Cursor cursor2 = cursor;
            if (!cursor2.moveToFirst()) {
                CloseableKt.closeFinally(cursor, null);
                return null;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                MediaHandler mediaHandler = this;
                Integer valueOf = Integer.valueOf(cursor2.getColumnIndex("_display_name"));
                if (valueOf.intValue() == -1) {
                    valueOf = null;
                }
                String string = valueOf != null ? cursor2.getString(valueOf.intValue()) : null;
                Integer valueOf2 = Integer.valueOf(cursor2.getColumnIndex("_size"));
                if (valueOf2.intValue() == -1) {
                    valueOf2 = null;
                }
                m12363constructorimpl = Result.m12363constructorimpl(new AdditionalFileData(string, valueOf2 != null ? Long.valueOf(cursor2.getLong(valueOf2.intValue())) : null));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m12363constructorimpl = Result.m12363constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m12369isFailureimpl(m12363constructorimpl)) {
                m12363constructorimpl = null;
            }
            AdditionalFileData additionalFileData = (AdditionalFileData) m12363constructorimpl;
            CloseableKt.closeFinally(cursor, null);
            return additionalFileData;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b0 A[Catch: FailedToExtractVideoMetadataException -> 0x00f9, TryCatch #0 {FailedToExtractVideoMetadataException -> 0x00f9, blocks: (B:12:0x006d, B:14:0x00b0, B:15:0x00b8, B:17:0x00ca, B:19:0x00d3, B:20:0x00d7), top: B:11:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca A[Catch: FailedToExtractVideoMetadataException -> 0x00f9, TryCatch #0 {FailedToExtractVideoMetadataException -> 0x00f9, blocks: (B:12:0x006d, B:14:0x00b0, B:15:0x00b8, B:17:0x00ca, B:19:0x00d3, B:20:0x00d7), top: B:11:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d3 A[Catch: FailedToExtractVideoMetadataException -> 0x00f9, TryCatch #0 {FailedToExtractVideoMetadataException -> 0x00f9, blocks: (B:12:0x006d, B:14:0x00b0, B:15:0x00b8, B:17:0x00ca, B:19:0x00d3, B:20:0x00d7), top: B:11:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleVideo(Uri uri, Continuation<? super ImagePickerAsset> continuation) {
        MediaHandler$handleVideo$1 mediaHandler$handleVideo$1;
        int i;
        File createOutputFile;
        int extractInt;
        Uri uri2 = uri;
        try {
            if (continuation instanceof MediaHandler$handleVideo$1) {
                mediaHandler$handleVideo$1 = (MediaHandler$handleVideo$1) continuation;
                if ((mediaHandler$handleVideo$1.label & Integer.MIN_VALUE) != 0) {
                    mediaHandler$handleVideo$1.label -= Integer.MIN_VALUE;
                    Object obj = mediaHandler$handleVideo$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = mediaHandler$handleVideo$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        createOutputFile = ImagePickerUtilsKt.createOutputFile(getCacheDirectory(), ".mp4");
                        ContentResolver contentResolver = getContext().getContentResolver();
                        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
                        mediaHandler$handleVideo$1.L$0 = uri2;
                        mediaHandler$handleVideo$1.L$1 = createOutputFile;
                        mediaHandler$handleVideo$1.label = 1;
                        if (ImagePickerUtilsKt.copyFile(uri2, createOutputFile, contentResolver, mediaHandler$handleVideo$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        File file = (File) mediaHandler$handleVideo$1.L$1;
                        Uri uri3 = (Uri) mediaHandler$handleVideo$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        createOutputFile = file;
                        uri2 = uri3;
                    }
                    Uri fromFile = Uri.fromFile(createOutputFile);
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(getContext(), fromFile);
                    AdditionalFileData additionalFileData = getAdditionalFileData(uri2);
                    ContentResolver contentResolver2 = getContext().getContentResolver();
                    Intrinsics.checkNotNullExpressionValue(contentResolver2, "getContentResolver(...)");
                    String type = ImagePickerUtilsKt.getType(contentResolver2, uri2);
                    Ref.IntRef intRef = new Ref.IntRef();
                    intRef.element = ImagePickerUtilsKt.extractInt(mediaMetadataRetriever, 18);
                    Ref.IntRef intRef2 = new Ref.IntRef();
                    intRef2.element = ImagePickerUtilsKt.extractInt(mediaMetadataRetriever, 19);
                    extractInt = ImagePickerUtilsKt.extractInt(mediaMetadataRetriever, 24);
                    if (extractInt % RotationOptions.ROTATE_180 != 0) {
                        int i2 = intRef2.element;
                        intRef2.element = intRef.element;
                        intRef.element = i2;
                    }
                    MediaType mediaType = MediaType.VIDEO;
                    String uri4 = fromFile.toString();
                    Intrinsics.checkNotNullExpressionValue(uri4, "toString(...)");
                    return new ImagePickerAsset(ImagePickerUtilsKt.getMediaStoreAssetId(uri2), mediaType, uri4, intRef.element, intRef2.element, additionalFileData == null ? additionalFileData.getFileName() : null, additionalFileData != null ? additionalFileData.getFileSize() : null, type, null, null, Boxing.boxInt(ImagePickerUtilsKt.extractInt(mediaMetadataRetriever, 9)), Boxing.boxInt(extractInt), 768, null);
                }
            }
            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
            mediaMetadataRetriever2.setDataSource(getContext(), fromFile);
            AdditionalFileData additionalFileData2 = getAdditionalFileData(uri2);
            ContentResolver contentResolver22 = getContext().getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver22, "getContentResolver(...)");
            String type2 = ImagePickerUtilsKt.getType(contentResolver22, uri2);
            Ref.IntRef intRef3 = new Ref.IntRef();
            intRef3.element = ImagePickerUtilsKt.extractInt(mediaMetadataRetriever2, 18);
            Ref.IntRef intRef22 = new Ref.IntRef();
            intRef22.element = ImagePickerUtilsKt.extractInt(mediaMetadataRetriever2, 19);
            extractInt = ImagePickerUtilsKt.extractInt(mediaMetadataRetriever2, 24);
            if (extractInt % RotationOptions.ROTATE_180 != 0) {
            }
            MediaType mediaType2 = MediaType.VIDEO;
            String uri42 = fromFile.toString();
            Intrinsics.checkNotNullExpressionValue(uri42, "toString(...)");
            return new ImagePickerAsset(ImagePickerUtilsKt.getMediaStoreAssetId(uri2), mediaType2, uri42, intRef3.element, intRef22.element, additionalFileData2 == null ? additionalFileData2.getFileName() : null, additionalFileData2 != null ? additionalFileData2.getFileSize() : null, type2, null, null, Boxing.boxInt(ImagePickerUtilsKt.extractInt(mediaMetadataRetriever2, 9)), Boxing.boxInt(extractInt), 768, null);
        } catch (FailedToExtractVideoMetadataException e) {
            throw new FailedToExtractVideoMetadataException(createOutputFile, e);
        }
        mediaHandler$handleVideo$1 = new MediaHandler$handleVideo$1(this, continuation);
        Object obj2 = mediaHandler$handleVideo$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mediaHandler$handleVideo$1.label;
        if (i != 0) {
        }
        Uri fromFile2 = Uri.fromFile(createOutputFile);
    }
}
