package io.intercom.android.sdk.ui.preview.viewmodel;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.webkit.URLUtil;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.imagepipeline.common.RotationOptions;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt;
import io.intercom.android.sdk.ui.preview.data.DeleteType;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.model.PreviewUiState;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: PreviewViewModel.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J\u001d\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0017J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J(\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J(\u0010\"\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010#\u001a\u00020 H\u0002J \u0010$\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\u0006\u0010!\u001a\u00020 H\u0002J(\u0010'\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010(\u001a\u00020)2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u0016H\u0003J(\u0010*\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u0016H\u0003J \u0010+\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u0016H\u0003J \u0010,\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u0016H\u0003J\u0012\u0010-\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0014\u0010.\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0002J\u0018\u00101\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u00102\u001a\u000203H\u0002J\u0018\u00104\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u00102\u001a\u000203H\u0002J\u0010\u00105\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u00106\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0015\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u000209H\u0000¢\u0006\u0002\b:J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u000209H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006?"}, d2 = {"Lio/intercom/android/sdk/ui/preview/viewmodel/PreviewViewModel;", "Landroidx/lifecycle/ViewModel;", "previewArgs", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;", "<init>", "(Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;)V", "downloadJob", "Lkotlinx/coroutines/Job;", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/ui/preview/model/PreviewUiState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState$intercom_sdk_ui_release", "()Lkotlinx/coroutines/flow/StateFlow;", "onDeleteClicked", "", "file", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;", "onDeleteClicked$intercom_sdk_ui_release", "saveFile", "context", "Landroid/content/Context;", "saveFile$intercom_sdk_ui_release", "saveImage", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile$NetworkFile;", "saveVideo", "saveDocument", "saveImageLegacy", "bitmap", "Landroid/graphics/Bitmap;", "url", "", "mimeType", "saveFileLegacy", "directory", "getNonExistingFileNameFromUrlLegacy", "fileDirectory", "Ljava/io/File;", "getNonExistingFileNameFromUrl", "contentUri", "Landroid/net/Uri;", "saveImageOnApi29Above", "saveVideoOnApi29Above", "saveFileOnApi29Above", "prepareBitmap", "rotate", "degrees", "", "saveImageToStream", "outputStream", "Ljava/io/OutputStream;", "saveFileToStream", "showFileSaveSuccess", "showFileSaveFailed", "onPageNavigated", "pageNo", "", "onPageNavigated$intercom_sdk_ui_release", "showDeleteAction", "", "size", "Companion", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PreviewViewModel extends ViewModel {
    private final MutableStateFlow<PreviewUiState> _state;
    private Job downloadJob;
    private final IntercomPreviewArgs previewArgs;
    private final StateFlow<PreviewUiState> state;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public PreviewViewModel(IntercomPreviewArgs previewArgs) {
        Intrinsics.checkNotNullParameter(previewArgs, "previewArgs");
        this.previewArgs = previewArgs;
        MutableStateFlow<PreviewUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(new PreviewUiState(null, 0, false, false, null, false, null, null, null, 511, null));
        this._state = MutableStateFlow;
        this.state = MutableStateFlow;
        MutableStateFlow.setValue(new PreviewUiState(previewArgs.getUris(), 0, showDeleteAction(previewArgs.getUris().size()), previewArgs.getShowSendCTA(), previewArgs.getCtaText(), previewArgs.getDownloadState().getShowDownloadAction(), previewArgs.getDownloadState().getFileSavingText(), previewArgs.getDownloadState().getFileSavedText(), previewArgs.getDownloadState().getSaveFailedText(), 2, null));
    }

    public final StateFlow<PreviewUiState> getState$intercom_sdk_ui_release() {
        return this.state;
    }

    public final void onDeleteClicked$intercom_sdk_ui_release(IntercomPreviewFile file) {
        PreviewUiState value;
        PreviewUiState previewUiState;
        List minus;
        Intrinsics.checkNotNullParameter(file, "file");
        MutableStateFlow<PreviewUiState> mutableStateFlow = this._state;
        do {
            value = mutableStateFlow.getValue();
            previewUiState = value;
            minus = CollectionsKt.minus(previewUiState.getFiles(), file);
        } while (!mutableStateFlow.compareAndSet(value, PreviewUiState.copy$default(previewUiState, minus, 0, showDeleteAction(minus.size()), false, null, false, null, null, null, TypedValues.PositionType.TYPE_PERCENT_X, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r0.isActive() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void saveFile$intercom_sdk_ui_release(IntercomPreviewFile file, Context context) {
        boolean z;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(context, "context");
        Job job = this.downloadJob;
        if (job != null) {
            z = true;
        }
        z = false;
        if (!(file instanceof IntercomPreviewFile.NetworkFile) || z) {
            return;
        }
        Toast.makeText(context, this._state.getValue().getFileSavingText(), 0).show();
        String mimeType = file.getMimeType(context);
        if (ContentTypeExtensionKt.isImage(mimeType)) {
            saveImage((IntercomPreviewFile.NetworkFile) file, context);
        } else if (ContentTypeExtensionKt.isVideo(mimeType)) {
            saveVideo((IntercomPreviewFile.NetworkFile) file, context);
        } else {
            saveDocument((IntercomPreviewFile.NetworkFile) file, context);
        }
    }

    private final void saveImage(IntercomPreviewFile.NetworkFile file, Context context) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new PreviewViewModel$saveImage$1(this, file, context, null), 2, null);
        this.downloadJob = launch$default;
    }

    private final void saveVideo(IntercomPreviewFile.NetworkFile file, Context context) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new PreviewViewModel$saveVideo$1(this, file, context, null), 2, null);
        this.downloadJob = launch$default;
    }

    private final void saveDocument(IntercomPreviewFile.NetworkFile file, Context context) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new PreviewViewModel$saveDocument$1(this, file, context, null), 2, null);
        this.downloadJob = launch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveImageLegacy(Bitmap bitmap, String url, String mimeType, Context context) {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        externalStoragePublicDirectory.mkdir();
        Intrinsics.checkNotNull(externalStoragePublicDirectory);
        saveImageToStream(bitmap, new FileOutputStream(new File(externalStoragePublicDirectory, getNonExistingFileNameFromUrlLegacy(url, externalStoragePublicDirectory, mimeType))));
        showFileSaveSuccess(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveFileLegacy(String url, String mimeType, Context context, String directory) {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(directory);
        externalStoragePublicDirectory.mkdir();
        Intrinsics.checkNotNull(externalStoragePublicDirectory);
        saveFileToStream(url, new FileOutputStream(new File(externalStoragePublicDirectory, getNonExistingFileNameFromUrlLegacy(url, externalStoragePublicDirectory, mimeType))));
        showFileSaveSuccess(context);
    }

    private final String getNonExistingFileNameFromUrlLegacy(String url, File fileDirectory, String mimeType) {
        String guessFileName = URLUtil.guessFileName(url, null, mimeType);
        Intrinsics.checkNotNull(guessFileName);
        int i = 0;
        List split$default = StringsKt.split$default((CharSequence) guessFileName, new String[]{"."}, false, 2, 2, (Object) null);
        String str = (String) CollectionsKt.getOrNull(split$default, 0);
        if (str == null) {
            str = "fileName";
        }
        Pair pair = TuplesKt.to(str, CollectionsKt.getOrNull(split$default, 1));
        String str2 = (String) pair.component1();
        String str3 = (String) pair.component2();
        while (true) {
            i++;
            if (new File(fileDirectory, guessFileName).exists()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2 + " (" + i + ')');
                if (str3 != null) {
                    sb.append("." + str3);
                }
                guessFileName = sb.toString();
                Intrinsics.checkNotNullExpressionValue(guessFileName, "toString(...)");
            } else {
                Intrinsics.checkNotNull(guessFileName);
                return guessFileName;
            }
        }
    }

    private final String getNonExistingFileNameFromUrl(String url, Uri contentUri, String mimeType, Context context) {
        String guessFileName = URLUtil.guessFileName(url, null, mimeType);
        Intrinsics.checkNotNull(guessFileName);
        int i = 0;
        List split$default = StringsKt.split$default((CharSequence) guessFileName, new String[]{"."}, false, 2, 2, (Object) null);
        String str = (String) CollectionsKt.getOrNull(split$default, 0);
        if (str == null) {
            str = "fileName";
        }
        Pair pair = TuplesKt.to(str, CollectionsKt.getOrNull(split$default, 1));
        String str2 = (String) pair.component1();
        String str3 = (String) pair.component2();
        ArrayList arrayList = new ArrayList();
        Cursor query = context.getContentResolver().query(contentUri, new String[]{"_display_name"}, "_display_name LIKE ? AND _display_name LIKE ?", new String[]{str2 + '%', "%." + str3}, null);
        if (query != null) {
            Cursor cursor = query;
            try {
                Cursor cursor2 = cursor;
                int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("_display_name");
                while (cursor2.moveToNext()) {
                    String string = cursor2.getString(columnIndexOrThrow);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    arrayList.add(string);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursor, null);
            } finally {
            }
        }
        while (true) {
            i++;
            if (arrayList.contains(guessFileName)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2 + " (" + i + ')');
                if (str3 != null) {
                    sb.append("." + str3);
                }
                guessFileName = sb.toString();
                Intrinsics.checkNotNullExpressionValue(guessFileName, "toString(...)");
            } else {
                Intrinsics.checkNotNull(guessFileName);
                return guessFileName;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveImageOnApi29Above(Bitmap bitmap, String url, String mimeType, Context context) {
        OutputStream openOutputStream;
        try {
            Uri EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
            String nonExistingFileNameFromUrl = getNonExistingFileNameFromUrl(url, EXTERNAL_CONTENT_URI, mimeType, context);
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", nonExistingFileNameFromUrl);
            contentValues.put("mime_type", mimeType);
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
            contentValues.put("is_pending", (Integer) 1);
            Uri insert = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (insert == null || (openOutputStream = context.getContentResolver().openOutputStream(insert)) == null) {
                return;
            }
            saveImageToStream(bitmap, openOutputStream);
            contentValues.clear();
            contentValues.put("is_pending", (Integer) 0);
            context.getContentResolver().update(insert, contentValues, null, null);
            showFileSaveSuccess(context);
        } catch (Exception e) {
            e.printStackTrace();
            showFileSaveFailed(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveVideoOnApi29Above(String url, String mimeType, Context context) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            Uri EXTERNAL_CONTENT_URI = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
            String nonExistingFileNameFromUrl = getNonExistingFileNameFromUrl(url, EXTERNAL_CONTENT_URI, mimeType, context);
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", nonExistingFileNameFromUrl);
            contentValues.put("mime_type", mimeType);
            contentValues.put("relative_path", Environment.DIRECTORY_MOVIES);
            contentValues.put("is_pending", (Integer) 1);
            ContentResolver contentResolver = context.getContentResolver();
            Uri insert = contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (insert == null || (openFileDescriptor = contentResolver.openFileDescriptor(insert, "w")) == null) {
                return;
            }
            saveFileToStream(url, new FileOutputStream(openFileDescriptor.getFileDescriptor()));
            openFileDescriptor.close();
            contentValues.clear();
            contentValues.put("is_pending", (Integer) 0);
            contentResolver.update(insert, contentValues, null, null);
            showFileSaveSuccess(context);
        } catch (Exception e) {
            e.printStackTrace();
            showFileSaveFailed(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveFileOnApi29Above(String url, String mimeType, Context context) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            Uri EXTERNAL_CONTENT_URI = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
            Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
            String nonExistingFileNameFromUrl = getNonExistingFileNameFromUrl(url, EXTERNAL_CONTENT_URI, mimeType, context);
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", nonExistingFileNameFromUrl);
            contentValues.put("mime_type", mimeType);
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
            ContentResolver contentResolver = context.getContentResolver();
            Uri insert = contentResolver.insert(MediaStore.Files.getContentUri("external"), contentValues);
            if (insert == null || (openFileDescriptor = contentResolver.openFileDescriptor(insert, "w")) == null) {
                return;
            }
            saveFileToStream(url, new FileOutputStream(openFileDescriptor.getFileDescriptor()));
            openFileDescriptor.close();
            contentValues.clear();
            contentResolver.update(insert, contentValues, null, null);
            showFileSaveSuccess(context);
        } catch (Exception e) {
            e.printStackTrace();
            showFileSaveFailed(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap prepareBitmap(String url) {
        try {
            int attributeInt = new ExifInterface(((URLConnection) FirebasePerfUrlConnection.instrument(new URL(url).openConnection())).getInputStream()).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
            int i = attributeInt != 3 ? attributeInt != 6 ? attributeInt != 8 ? 0 : RotationOptions.ROTATE_270 : 90 : RotationOptions.ROTATE_180;
            Bitmap decodeStream = BitmapFactory.decodeStream(((URLConnection) FirebasePerfUrlConnection.instrument(new URL(url).openConnection())).getInputStream());
            Intrinsics.checkNotNull(decodeStream);
            return rotate(decodeStream, i);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private final Bitmap rotate(Bitmap bitmap, float f) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    private final void saveImageToStream(Bitmap bitmap, OutputStream outputStream) {
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
        outputStream.close();
    }

    private final void saveFileToStream(String url, OutputStream outputStream) {
        InputStream inputStream = ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(url).openConnection())).getInputStream();
        if (inputStream != null) {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                } else {
                    outputStream.write(bArr, 0, read);
                }
            }
            inputStream.close();
        }
        outputStream.close();
    }

    private final void showFileSaveSuccess(Context context) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new PreviewViewModel$showFileSaveSuccess$1(context, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFileSaveFailed(Context context) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new PreviewViewModel$showFileSaveFailed$1(context, this, null), 2, null);
    }

    public final void onPageNavigated$intercom_sdk_ui_release(int pageNo) {
        MutableStateFlow<PreviewUiState> mutableStateFlow = this._state;
        while (true) {
            PreviewUiState value = mutableStateFlow.getValue();
            int i = pageNo;
            if (mutableStateFlow.compareAndSet(value, PreviewUiState.copy$default(value, null, i, false, false, null, false, null, null, null, 509, null))) {
                return;
            } else {
                pageNo = i;
            }
        }
    }

    private final boolean showDeleteAction(int size) {
        DeleteType deleteType = this.previewArgs.getDeleteType();
        if (Intrinsics.areEqual(deleteType, DeleteType.None.INSTANCE)) {
            return false;
        }
        if (Intrinsics.areEqual(deleteType, DeleteType.Delete.INSTANCE)) {
            return true;
        }
        if (Intrinsics.areEqual(deleteType, DeleteType.Remove.INSTANCE)) {
            return size > 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: PreviewViewModel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\r¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/ui/preview/viewmodel/PreviewViewModel$Companion;", "", "<init>", "()V", "create", "Lio/intercom/android/sdk/ui/preview/viewmodel/PreviewViewModel;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "previewArgs", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;", "create$intercom_sdk_ui_release", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory$intercom_sdk_ui_release", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PreviewViewModel create$intercom_sdk_ui_release(ViewModelStoreOwner owner, IntercomPreviewArgs previewArgs) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(previewArgs, "previewArgs");
            return (PreviewViewModel) new ViewModelProvider(owner, factory$intercom_sdk_ui_release(previewArgs)).get(PreviewViewModel.class);
        }

        public final ViewModelProvider.Factory factory$intercom_sdk_ui_release(final IntercomPreviewArgs previewArgs) {
            Intrinsics.checkNotNullParameter(previewArgs, "previewArgs");
            return new ViewModelProvider.Factory() { // from class: io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$Companion$factory$1
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public <T extends ViewModel> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    return new PreviewViewModel(IntercomPreviewArgs.this);
                }
            };
        }
    }
}
