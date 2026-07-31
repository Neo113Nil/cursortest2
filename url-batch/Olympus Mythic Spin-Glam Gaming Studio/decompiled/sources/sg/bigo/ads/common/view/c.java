package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes15.dex */
public final class c extends ImageView {
    public c(@NonNull Context context, String str) {
        super(context);
        try {
            if (r.a((CharSequence) str)) {
                return;
            }
            byte[] decode = Base64.decode(str, 0);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            if (decodeByteArray == null) {
                return;
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), decodeByteArray);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
            setBackground(bitmapDrawable);
            setClickable(false);
            setFocusable(false);
        } catch (Exception unused) {
        }
    }

    public static void a(Context context, ViewGroup viewGroup, @Nullable c cVar) {
        KeyEvent.Callback callback = viewGroup;
        if (cVar == null || context == null) {
            return;
        }
        if (viewGroup == null) {
            callback = v.a(context, (View) null);
        }
        if (callback instanceof ViewGroup) {
            v.a(cVar, (ViewGroup) callback, new ViewGroup.LayoutParams(-1, -1), -1);
            cVar.bringToFront();
        }
    }
}
