package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Base64;
import android.util.DisplayMetrics;
import androidx.core.graphics.PathParser;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class a1 {
    public static Bitmap a(Context context) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int a = qi.a(1, context);
        int i = a * 20;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, config);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setStrokeWidth(a * 2);
        paint.setAntiAlias(true);
        paint.setColor(-5131855);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        float f = a * 7;
        path.moveTo(a, f);
        path.lineTo(a * 10, a * 14);
        path.lineTo(a * 19, f);
        canvas.drawPath(path, paint);
        return createBitmap;
    }

    public static Bitmap b(Context context) {
        byte[] decode = Base64.decode("iVBORw0KGgoAAAANSUhEUgAAAGAAAABgCAQAAABIkb+zAAAAAmJLR0QAAKqNIzIAAAAJcEhZcwAACxMAAAsTAQCanBgAAAAHdElNRQfgAR0KGztQKbC4AAAA8UlEQVR42u2aQQ6EMAzE6IhH8wR+DfeVoCAySRfs82plQ0FNxTQBAAAAAMBXab0frFut4NIeBFTLX4lo4+ufJ+i1z8BI1//sHvz9HSCAAAIIIIAAAiqZo/bl0Vzdi7GECCCAAAJGDlg392wtr77/eEBufXeC/PreBGXoOxOUo+9LUJa+K0F5+p4EZeo7EpSrH5+gbP3oBOXrxyaoQj8yQTX6cQmq0o9KUJ1+TML89A+Ozot+1VznSkxkBBBAAAEEEEAAAQQQ4J8HeqPH3f3+UDMxS4iAgDXt5cVf7iruvVJx/Tuv0aWN//k9AAAAAAB8lx0xVUXCRDTw+wAAAABJRU5ErkJggg==", 0);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = 640;
        options.inTargetDensity = qi.b();
        return BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
    }

    public static Bitmap c(int i, Context context) {
        Bitmap bitmap;
        try {
            bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            mi.a("BaseResources: Cannot build icon - OOME");
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        Path createPathFromPathData = PathParser.createPathFromPathData("M5.14631 3.63426C5.90846 3.22666 6.65813 3.1 8.22778 3.1H10.1C10.5971 3.1 11 3.50294 11 4C11 4.49705 10.5971 4.9 10.1 4.9H8.22778C6.74111 4.9 6.35717 5.02794 5.99519 5.22153C5.65934 5.40114 5.40115 5.65934 5.22154 5.99518C5.02795 6.35717 4.90001 6.7411 4.90001 8.22777V15.7722C4.90001 17.2589 5.02795 17.6428 5.22154 18.0048C5.40115 18.3407 5.65934 18.5989 5.99519 18.7785C6.35717 18.9721 6.74111 19.1 8.22778 19.1H15.7722C17.2589 19.1 17.6428 18.9721 18.0048 18.7785C18.3407 18.5989 18.5989 18.3407 18.7785 18.0048C18.9721 17.6428 19.1 17.2589 19.1 15.7722V13.9C19.1 13.4029 19.5029 13 20 13C20.4971 13 20.9 13.4029 20.9 13.9V15.7722C20.9 17.3419 20.7733 18.0915 20.3657 18.8537C20.0184 19.5032 19.5032 20.0184 18.8537 20.3657C18.0915 20.7733 17.3419 20.9 15.7722 20.9H8.22778C6.65813 20.9 5.90847 20.7733 5.14631 20.3657C4.49678 20.0184 3.98164 19.5032 3.63427 18.8537C3.22667 18.0915 3.10001 17.3419 3.10001 15.7722V8.22777C3.10001 6.65812 3.22667 5.90846 3.63427 5.14631C3.98165 4.49678 4.49678 3.98164 5.14631 3.63426Z");
        Path createPathFromPathData2 = PathParser.createPathFromPathData("M14 4C14 3.50294 14.403 3.1 14.9 3.1H20C20.4971 3.1 20.9 3.50294 20.9 4V9.1C20.9 9.59705 20.4971 10 20 10C19.503 10 19.1 9.59705 19.1 9.1V6.17279L12.5364 12.7364C12.185 13.0879 11.6151 13.0879 11.2636 12.7364C10.9122 12.3849 10.9122 11.8151 11.2636 11.4636L17.8272 4.9H14.9C14.403 4.9 14 4.49705 14 4Z");
        RectF rectF = new RectF();
        createPathFromPathData.computeBounds(rectF, true);
        createPathFromPathData2.computeBounds(rectF, true);
        Matrix matrix = new Matrix();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        matrix.postTranslate(-rectF.left, -rectF.top);
        float f = displayMetrics.density;
        matrix.postScale(f, f);
        float f2 = i;
        matrix.postTranslate((f2 - (rectF.width() * f)) / 2.0f, (f2 - (rectF.height() * f)) / 2.0f);
        createPathFromPathData.transform(matrix);
        createPathFromPathData2.transform(matrix);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawPath(createPathFromPathData, paint);
        canvas.drawPath(createPathFromPathData2, paint);
        return bitmap;
    }

    public static Bitmap d(int i, Context context) {
        Bitmap bitmap;
        try {
            bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            mi.a("BaseResources: Cannot build icon - OOME");
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        Path createPathFromPathData = PathParser.createPathFromPathData("M9.01777 12L15.1339 5.88388C15.622 5.39573 15.622 4.60427 15.1339 4.11612C14.6457 3.62796 13.8543 3.62796 13.3661 4.11612L6.36612 11.1161C5.87796 11.6043 5.87796 12.3957 6.36612 12.8839L13.3661 19.8839C13.8543 20.372 14.6457 20.372 15.1339 19.8839C15.622 19.3957 15.622 18.6043 15.1339 18.1161L9.01777 12Z");
        RectF rectF = new RectF();
        createPathFromPathData.computeBounds(rectF, true);
        Matrix matrix = new Matrix();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        matrix.postTranslate(-rectF.left, -rectF.top);
        float f = displayMetrics.density;
        matrix.postScale(f, f);
        float f2 = i;
        matrix.postTranslate((f2 - (rectF.width() * f)) / 2.0f, (f2 - (rectF.height() * f)) / 2.0f);
        createPathFromPathData.transform(matrix);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        new Canvas(bitmap).drawPath(createPathFromPathData, paint);
        return bitmap;
    }

    public static Bitmap e(int i, Context context) {
        Bitmap bitmap;
        try {
            bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            mi.a("BaseResources: Cannot build icon - OOME");
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        Path createPathFromPathData = PathParser.createPathFromPathData("M6 7.6C6 7.03995 6 6.75992 6.10899 6.54601C6.20487 6.35785 6.35785 6.20487 6.54601 6.10899C6.75992 6 7.03995 6 7.6 6H8.4C8.96005 6 9.24008 6 9.45399 6.10899C9.64215 6.20487 9.79513 6.35785 9.89101 6.54601C10 6.75992 10 7.03995 10 7.6V18.4C10 18.9601 10 19.2401 9.89101 19.454C9.79513 19.6422 9.64215 19.7951 9.45399 19.891C9.24008 20 8.96005 20 8.4 20H7.6C7.03995 20 6.75992 20 6.54601 19.891C6.35785 19.7951 6.20487 19.6422 6.10899 19.454C6 19.2401 6 18.9601 6 18.4V7.6Z");
        Path createPathFromPathData2 = PathParser.createPathFromPathData("M14 7.6C14 7.03995 14 6.75992 14.109 6.54601C14.2049 6.35785 14.3578 6.20487 14.546 6.10899C14.7599 6 15.0399 6 15.6 6H16.4C16.9601 6 17.2401 6 17.454 6.10899C17.6422 6.20487 17.7951 6.35785 17.891 6.54601C18 6.75992 18 7.03995 18 7.6V18.4C18 18.9601 18 19.2401 17.891 19.454C17.7951 19.6422 17.6422 19.7951 17.454 19.891C17.2401 20 16.9601 20 16.4 20H15.6C15.0399 20 14.7599 20 14.546 19.891C14.3578 19.7951 14.2049 19.6422 14.109 19.454C14 19.2401 14 18.9601 14 18.4V7.6Z");
        Path createPathFromPathData3 = PathParser.createPathFromPathData("M8.40039 5.75C8.67611 5.75 8.89794 5.75001 9.07715 5.76465C9.25936 5.77954 9.41931 5.81127 9.56738 5.88672C9.8025 6.00655 9.99345 6.1975 10.1133 6.43262C10.1887 6.58069 10.2205 6.74064 10.2354 6.92285C10.25 7.10206 10.25 7.32389 10.25 7.59961V18.4004C10.25 18.6761 10.25 18.8979 10.2354 19.0771C10.2205 19.2594 10.1887 19.4193 10.1133 19.5674C9.99345 19.8025 9.8025 19.9935 9.56738 20.1133C9.41931 20.1887 9.25936 20.2205 9.07715 20.2354C8.89794 20.25 8.67611 20.25 8.40039 20.25H7.59961C7.32389 20.25 7.10206 20.25 6.92285 20.2354C6.74064 20.2205 6.58069 20.1887 6.43262 20.1133C6.1975 19.9935 6.00655 19.8025 5.88672 19.5674C5.81127 19.4193 5.77954 19.2594 5.76465 19.0771C5.75001 18.8979 5.75 18.6761 5.75 18.4004V7.59961C5.75 7.32389 5.75001 7.10206 5.76465 6.92285C5.77954 6.74064 5.81127 6.58069 5.88672 6.43262C6.00655 6.1975 6.1975 6.00655 6.43262 5.88672C6.58069 5.81127 6.74064 5.77954 6.92285 5.76465C7.10206 5.75001 7.32389 5.75 7.59961 5.75H8.40039ZM16.4004 5.75C16.6761 5.75 16.8979 5.75001 17.0771 5.76465C17.2594 5.77954 17.4193 5.81127 17.5674 5.88672C17.8025 6.00655 17.9935 6.1975 18.1133 6.43262C18.1887 6.58069 18.2205 6.74064 18.2354 6.92285C18.25 7.10206 18.25 7.32389 18.25 7.59961V18.4004C18.25 18.6761 18.25 18.8979 18.2354 19.0771C18.2205 19.2594 18.1887 19.4193 18.1133 19.5674C17.9935 19.8025 17.8025 19.9935 17.5674 20.1133C17.4193 20.1887 17.2594 20.2205 17.0771 20.2354C16.8979 20.25 16.6761 20.25 16.4004 20.25H15.5996C15.3239 20.25 15.1021 20.25 14.9229 20.2354C14.7406 20.2205 14.5807 20.1887 14.4326 20.1133C14.1975 19.9935 14.0065 19.8025 13.8867 19.5674C13.8113 19.4193 13.7795 19.2594 13.7646 19.0771C13.75 18.8979 13.75 18.6761 13.75 18.4004V7.59961C13.75 7.32389 13.75 7.10206 13.7646 6.92285C13.7795 6.74064 13.8113 6.58069 13.8867 6.43262C14.0065 6.1975 14.1975 6.00655 14.4326 5.88672C14.5807 5.81127 14.7406 5.77954 14.9229 5.76465C15.1021 5.75001 15.3239 5.75 15.5996 5.75H16.4004Z");
        RectF rectF = new RectF();
        createPathFromPathData.computeBounds(rectF, true);
        createPathFromPathData2.computeBounds(rectF, true);
        createPathFromPathData3.computeBounds(rectF, true);
        Matrix matrix = new Matrix();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        matrix.postTranslate(-rectF.left, -rectF.top);
        float f = displayMetrics.density;
        matrix.postScale(f, f);
        float f2 = i;
        matrix.postTranslate((f2 - (rectF.width() * f)) / 2.0f, (f2 - (rectF.height() * f)) / 2.0f);
        createPathFromPathData.transform(matrix);
        createPathFromPathData2.transform(matrix);
        createPathFromPathData3.transform(matrix);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        paint2.setColor(520093696);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(0.5f);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint();
        paint3.setColor(-1);
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        paint3.setShadowLayer(5.0f, 0.0f, 0.0f, 687865856);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawPath(createPathFromPathData, paint);
        canvas.drawPath(createPathFromPathData2, paint);
        canvas.drawPath(createPathFromPathData3, paint2);
        canvas.drawPath(createPathFromPathData3, paint3);
        return bitmap;
    }

    public static Bitmap f(int i, Context context) {
        Bitmap bitmap;
        try {
            bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            mi.a("BaseResources: Cannot build icon - OOME");
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        Path createPathFromPathData = PathParser.createPathFromPathData("M8.133 6.10517L18.63 12.3502C18.7417 12.4166 18.8342 12.511 18.8984 12.624C18.9627 12.737 18.9964 12.8647 18.9964 12.9947C18.9964 13.1246 18.9627 13.2524 18.8984 13.3654C18.8342 13.4783 18.7417 13.5727 18.63 13.6392L8.135 19.8942C8.02115 19.9623 7.89127 19.999 7.75861 20.0005C7.62595 20.002 7.49526 19.9683 7.37988 19.9028C7.26449 19.8374 7.16854 19.7425 7.1018 19.6278C7.03506 19.5131 6.99994 19.3828 7 19.2502V6.75017C6.99997 6.61771 7.03502 6.48762 7.10158 6.3731C7.16814 6.25859 7.26384 6.16375 7.37895 6.09822C7.49406 6.03269 7.62446 5.99881 7.75691 6.00003C7.88936 6.00125 8.01912 6.03753 8.133 6.10517Z");
        Path createPathFromPathData2 = PathParser.createPathFromPathData("M7.75879 5.75C7.93538 5.75163 8.1089 5.80044 8.26074 5.89062L18.7578 12.1357C18.9066 12.2243 19.0306 12.3495 19.1162 12.5C19.2019 12.6506 19.2461 12.8218 19.2461 12.9951C19.246 13.1683 19.2018 13.3387 19.1162 13.4893C19.0306 13.6398 18.9066 13.7649 18.7578 13.8535L8.2627 20.1094L8.26172 20.1084C8.11024 20.1988 7.9381 20.2479 7.76172 20.25C7.58491 20.252 7.41064 20.2073 7.25684 20.1201C7.10308 20.0329 6.97472 19.9067 6.88574 19.7539C6.79676 19.601 6.74992 19.4269 6.75 19.25V6.75C6.75 6.57347 6.79703 6.39969 6.88574 6.24707C6.97443 6.09466 7.10166 5.96814 7.25488 5.88086C7.40824 5.79356 7.58234 5.74845 7.75879 5.75Z");
        RectF rectF = new RectF();
        createPathFromPathData.computeBounds(rectF, true);
        createPathFromPathData2.computeBounds(rectF, true);
        Matrix matrix = new Matrix();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        matrix.postTranslate(-rectF.left, -rectF.top);
        float f = displayMetrics.density;
        matrix.postScale(f, f);
        float f2 = i;
        matrix.postTranslate((f2 - (rectF.width() * f)) / 2.0f, (f2 - (rectF.height() * f)) / 2.0f);
        createPathFromPathData.transform(matrix);
        createPathFromPathData2.transform(matrix);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        paint2.setColor(520093696);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(0.5f);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint();
        paint3.setColor(-1);
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        paint3.setShadowLayer(5.0f, 0.0f, 0.0f, 687865856);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawPath(createPathFromPathData, paint);
        canvas.drawPath(createPathFromPathData2, paint2);
        canvas.drawPath(createPathFromPathData2, paint3);
        return bitmap;
    }

    public static Bitmap g(int i, Context context) {
        Bitmap bitmap;
        try {
            bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            mi.a("BaseResources: Cannot build icon - OOME");
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        Path createPathFromPathData = PathParser.createPathFromPathData("M14.9822 12L8.86612 5.88388C8.37796 5.39573 8.37796 4.60427 8.86612 4.11612C9.35427 3.62796 10.1457 3.62796 10.6339 4.11612L17.6339 11.1161C18.122 11.6043 18.122 12.3957 17.6339 12.8839L10.6339 19.8839C10.1457 20.372 9.35427 20.372 8.86612 19.8839C8.37796 19.3957 8.37796 18.6043 8.86612 18.1161L14.9822 12Z");
        RectF rectF = new RectF();
        createPathFromPathData.computeBounds(rectF, true);
        Matrix matrix = new Matrix();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        matrix.postTranslate(-rectF.left, -rectF.top);
        float f = displayMetrics.density;
        matrix.postScale(f, f);
        float f2 = i;
        matrix.postTranslate((f2 - (rectF.width() * f)) / 2.0f, (f2 - (rectF.height() * f)) / 2.0f);
        createPathFromPathData.transform(matrix);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        new Canvas(bitmap).drawPath(createPathFromPathData, paint);
        return bitmap;
    }

    public static Bitmap h(int i, Context context) {
        Bitmap bitmap;
        try {
            bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            mi.a("BaseResources: Cannot build icon - OOME");
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        Path createPathFromPathData = PathParser.createPathFromPathData("M8.59561 5.74605L20.2512 17.4044C20.5766 17.7299 20.5766 18.2575 20.2512 18.5829C19.9508 18.8833 19.4782 18.9064 19.1513 18.6523L19.0727 18.5829L16.3333 15.8425V19.6667C16.3333 20.094 16.0116 20.4463 15.5972 20.4944L15.5 20.5C14.9655 20.5 14.4518 20.2924 14.0674 19.921L9.49177 15.5H7.16667C6.24619 15.5 5.5 14.7538 5.5 13.8333V12.1667C5.5 11.2462 6.24619 10.5 7.16667 10.5H9.47083L10.2458 9.75333L7.41716 6.92463C7.09175 6.59915 7.09178 6.0715 7.41723 5.74605C7.74263 5.42065 8.27021 5.42065 8.59561 5.74605ZM15.5 5.5C15.9602 5.5 16.3333 5.8731 16.3333 6.33333V11.1333L12.645 7.445L14.0662 6.07783C14.4129 5.74417 14.8638 5.54306 15.3403 5.50617L15.5 5.5Z");
        Path createPathFromPathData2 = PathParser.createPathFromPathData("M7.24023 5.56934C7.66326 5.14631 8.34943 5.14631 8.77246 5.56934L20.4277 17.2275C20.8508 17.6507 20.8508 18.3367 20.4277 18.7598C20.0371 19.1502 19.4231 19.18 18.998 18.8496L18.9912 18.8447L18.9854 18.8398L18.9072 18.7705L18.9014 18.7646L18.8955 18.7598L16.583 16.4463V19.667C16.5828 20.2226 16.1649 20.6806 15.626 20.7432H15.6191L15.6113 20.7441L15.5146 20.75H15.5C14.9006 20.75 14.3246 20.5171 13.8936 20.1006L9.3916 15.75H7.16699C6.10845 15.75 5.25 14.8916 5.25 13.833V12.167C5.25 11.1084 6.10845 10.25 7.16699 10.25H9.37109L9.88867 9.74902L7.24023 7.10156C6.81726 6.67849 6.8173 5.99242 7.24023 5.56934ZM15.3311 5.25684L15.4902 5.25H15.5C16.0982 5.25 16.5828 5.73485 16.583 6.33301V11.7373L12.4678 7.62207L12.2881 7.44141L12.4717 7.26465L13.8926 5.89746C14.2812 5.52346 14.7872 5.29818 15.3213 5.25684L15.3311 5.25586V5.25684Z");
        RectF rectF = new RectF();
        createPathFromPathData.computeBounds(rectF, true);
        createPathFromPathData2.computeBounds(rectF, true);
        Matrix matrix = new Matrix();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        matrix.postTranslate(-rectF.left, -rectF.top);
        float f = displayMetrics.density;
        matrix.postScale(f, f);
        float f2 = i;
        matrix.postTranslate((f2 - (rectF.width() * f)) / 2.0f, (f2 - (rectF.height() * f)) / 2.0f);
        createPathFromPathData.transform(matrix);
        createPathFromPathData2.transform(matrix);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        paint2.setColor(520093696);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(0.5f);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint();
        paint3.setColor(-1);
        paint3.setAntiAlias(true);
        paint2.setStyle(style);
        paint3.setShadowLayer(5.0f, 0.0f, 0.0f, 687865856);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawPath(createPathFromPathData, paint);
        canvas.drawPath(createPathFromPathData2, paint2);
        canvas.drawPath(createPathFromPathData2, paint3);
        return bitmap;
    }

    public static Bitmap i(int i, Context context) {
        Bitmap bitmap;
        try {
            bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            mi.a("BaseResources: Cannot build icon - OOME");
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        Path createPathFromPathData = PathParser.createPathFromPathData("M15.5 5.5C15.9602 5.5 16.3333 5.8731 16.3333 6.33333V19.6667C16.3333 20.1269 15.9602 20.5 15.5 20.5C14.9655 20.5 14.4518 20.2924 14.0674 19.921L9.49177 15.5H7.16667C6.24619 15.5 5.5 14.7538 5.5 13.8333V12.1667C5.5 11.2462 6.24619 10.5 7.16667 10.5H9.47083L14.0662 6.07783C14.4515 5.7071 14.9653 5.5 15.5 5.5ZM19.9867 8.28596C20.2796 7.99306 20.7545 7.99306 21.0474 8.28596C23.6509 10.8895 23.6509 15.1106 21.0474 17.714C20.7545 18.0069 20.2796 18.0069 19.9867 17.714C19.6938 17.4212 19.6938 16.9463 19.9867 16.6534C22.0044 14.6357 22.0044 11.3643 19.9867 9.34662C19.6938 9.05372 19.6938 8.57885 19.9867 8.28596ZM17.8654 10.4073C18.1583 10.1144 18.6332 10.1144 18.9261 10.4073C20.358 11.8392 20.358 14.1608 18.9261 15.5927C18.6332 15.8856 18.1583 15.8856 17.8654 15.5927C17.5725 15.2998 17.5725 14.825 17.8654 14.5321C18.7115 13.6859 18.7115 12.3141 17.8654 11.4679C17.5725 11.175 17.5725 10.7002 17.8654 10.4073Z");
        Path createPathFromPathData2 = PathParser.createPathFromPathData("M15.5 5.25C16.0982 5.25 16.5828 5.73485 16.583 6.33301V19.667C16.5828 20.2652 16.0982 20.75 15.5 20.75C14.9006 20.75 14.3246 20.5171 13.8936 20.1006L9.3916 15.75H7.16699C6.10845 15.75 5.25 14.8916 5.25 13.833V12.167C5.25 11.1084 6.10845 10.25 7.16699 10.25H9.37109L13.8926 5.89746C14.3244 5.4819 14.9007 5.25 15.5 5.25ZM19.8096 8.10938C20.2001 7.71885 20.8341 7.71885 21.2246 8.10938C23.9253 10.8104 23.9253 15.1896 21.2246 17.8906C20.8341 18.2811 20.2001 18.2811 19.8096 17.8906C19.4194 17.5001 19.4193 16.867 19.8096 16.4766C21.7296 14.5565 21.7296 11.4435 19.8096 9.52344C19.4193 9.13299 19.4194 8.49987 19.8096 8.10938ZM17.6885 10.2305C18.0789 9.84 18.712 9.84011 19.1025 10.2305C20.6321 11.76 20.6321 14.24 19.1025 15.7695C18.712 16.1599 18.0789 16.16 17.6885 15.7695C17.2981 15.3791 17.2981 14.746 17.6885 14.3555C18.437 13.607 18.437 12.393 17.6885 11.6445C17.2981 11.254 17.2981 10.6209 17.6885 10.2305Z");
        RectF rectF = new RectF();
        createPathFromPathData.computeBounds(rectF, true);
        createPathFromPathData2.computeBounds(rectF, true);
        Matrix matrix = new Matrix();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        matrix.postTranslate(-rectF.left, -rectF.top);
        float f = displayMetrics.density;
        matrix.postScale(f, f);
        float f2 = i;
        matrix.postTranslate((f2 - (rectF.width() * f)) / 2.0f, (f2 - (rectF.height() * f)) / 2.0f);
        createPathFromPathData.transform(matrix);
        createPathFromPathData2.transform(matrix);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        paint2.setColor(520093696);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(0.5f);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint();
        paint3.setColor(-1);
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        paint3.setShadowLayer(5.0f, 0.0f, 0.0f, 687865856);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawPath(createPathFromPathData, paint);
        canvas.drawPath(createPathFromPathData2, paint2);
        canvas.drawPath(createPathFromPathData2, paint3);
        return bitmap;
    }

    public static Bitmap j(int i, Context context) {
        Bitmap bitmap;
        try {
            bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            mi.a("BaseResources: Cannot build icon - OOME");
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        Path createPathFromPathData = PathParser.createPathFromPathData("M12 9.01777L5.88388 15.1339C5.39573 15.622 4.60427 15.622 4.11612 15.1339C3.62796 14.6457 3.62796 13.8543 4.11612 13.3661L11.1161 6.36612C11.6043 5.87796 12.3957 5.87796 12.8839 6.36612L19.8839 13.3661C20.372 13.8543 20.372 14.6457 19.8839 15.1339C19.3957 15.622 18.6043 15.622 18.1161 15.1339L12 9.01777Z");
        RectF rectF = new RectF();
        createPathFromPathData.computeBounds(rectF, true);
        Matrix matrix = new Matrix();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        matrix.postTranslate(-rectF.left, -rectF.top);
        float f = displayMetrics.density;
        matrix.postScale(f, f);
        float f2 = i;
        matrix.postTranslate((f2 - (rectF.width() * f)) / 2.0f, (f2 - (rectF.height() * f)) / 2.0f);
        createPathFromPathData.transform(matrix);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        new Canvas(bitmap).drawPath(createPathFromPathData, paint);
        return bitmap;
    }

    public static Bitmap b(int i, Context context) {
        Bitmap bitmap;
        try {
            bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            mi.a("BaseResources: Cannot build icon - OOME");
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        Path createPathFromPathData = PathParser.createPathFromPathData("M12 14.9822L5.88388 8.86612C5.39573 8.37796 4.60427 8.37796 4.11612 8.86612C3.62796 9.35427 3.62796 10.1457 4.11612 10.6339L11.1161 17.6339C11.6043 18.122 12.3957 18.122 12.8839 17.6339L19.8839 10.6339C20.372 10.1457 20.372 9.35427 19.8839 8.86612C19.3957 8.37796 18.6043 8.37796 18.1161 8.86612L12 14.9822Z");
        RectF rectF = new RectF();
        createPathFromPathData.computeBounds(rectF, true);
        Matrix matrix = new Matrix();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        matrix.postTranslate(-rectF.left, -rectF.top);
        float f = displayMetrics.density;
        matrix.postScale(f, f);
        float f2 = i;
        matrix.postTranslate((f2 - (rectF.width() * f)) / 2.0f, (f2 - (rectF.height() * f)) / 2.0f);
        createPathFromPathData.transform(matrix);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        new Canvas(bitmap).drawPath(createPathFromPathData, paint);
        return bitmap;
    }

    public static Bitmap a(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setStrokeWidth(i2);
        paint.setAntiAlias(true);
        paint.setColor(-7829368);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setStyle(Paint.Style.STROKE);
        float f = i;
        canvas.drawLine(0.0f, 0.0f, f, f, paint);
        canvas.drawLine(0.0f, f, f, 0.0f, paint);
        return createBitmap;
    }

    public static Bitmap a(int i, boolean z, Context context) {
        Bitmap bitmap;
        try {
            bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            mi.a("BaseResources: Cannot build icon - OOME");
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        Canvas canvas = new Canvas(bitmap);
        if (z) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(1711276032);
            float f = i;
            canvas.drawOval(new RectF(0.0f, 0.0f, f, f), paint);
        }
        Path createPathFromPathData = PathParser.createPathFromPathData("M11.25,16C11.25,17.243 10.243,18.25 9,18.25C7.757,18.25 6.75,17.243 6.75,16C6.75,14.757 7.757,13.75 9,13.75C10.243,13.75 11.25,14.757 11.25,16ZM18.25,16C18.25,17.243 17.243,18.25 16,18.25C14.757,18.25 13.75,17.243 13.75,16C13.75,14.757 14.757,13.75 16,13.75C17.243,13.75 18.25,14.757 18.25,16ZM23,18.25C24.243,18.25 25.25,17.243 25.25,16C25.25,14.757 24.243,13.75 23,13.75C21.757,13.75 20.75,14.757 20.75,16C20.75,17.243 21.757,18.25 23,18.25Z");
        RectF rectF = new RectF();
        createPathFromPathData.computeBounds(rectF, true);
        Matrix matrix = new Matrix();
        matrix.postTranslate(-rectF.left, -rectF.top);
        float f2 = context.getResources().getDisplayMetrics().density;
        matrix.postScale(f2, f2);
        float f3 = i;
        matrix.postTranslate((f3 - (rectF.width() * f2)) / 2.0f, (f3 - (rectF.height() * f2)) / 2.0f);
        createPathFromPathData.transform(matrix);
        Paint paint2 = new Paint();
        if (z) {
            paint2.setColor(-1);
        } else {
            paint2.setColor(-6708563);
        }
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        canvas.drawPath(createPathFromPathData, paint2);
        return bitmap;
    }

    public static Bitmap a(int i) {
        Bitmap bitmap;
        try {
            bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            mi.a("BaseResources: Cannot build icon - OOME");
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        float f = i;
        float f2 = f / 100.0f;
        Paint paint = new Paint();
        paint.setColor(0);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Canvas canvas = new Canvas(bitmap);
        float f3 = 3.0f * f2;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(1711276032);
        canvas.drawOval(new RectF(0.0f, 0.0f, f, f), paint2);
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        paint3.setStrokeWidth(f3);
        paint3.setColor(-1);
        float f4 = i / 2;
        canvas.drawCircle(f4, f4, f4 - (f3 / 2.0f), paint3);
        paint.setStrokeWidth(f3);
        paint.setColor(-1);
        paint.setAntiAlias(true);
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        float f5 = 33.0f * f2;
        path.moveTo(f5, f5);
        float f6 = 66.0f * f2;
        path.lineTo(f6, f6);
        path.moveTo(f5, f6);
        float f7 = 50.0f * f2;
        path.lineTo(f7, f7);
        path.moveTo(55.0f * f2, f2 * 45.0f);
        path.lineTo(f6, f5);
        path.close();
        canvas.drawPath(path, paint);
        return bitmap;
    }

    public static Bitmap a(int i, Context context) {
        Bitmap bitmap;
        try {
            bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            mi.a("BaseResources: Cannot build icon - OOME");
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        Paint paint = new Paint();
        Canvas canvas = new Canvas(bitmap);
        paint.setAntiAlias(true);
        paint.setColor(1711276032);
        float f = i;
        canvas.drawOval(new RectF(0.0f, 0.0f, f, f), paint);
        Path createPathFromPathData = PathParser.createPathFromPathData("M 0.263 0.264 C 0.615 -0.088 1.185 -0.088 1.536 0.264 L 7 5.727 L 12.463 0.264 C 12.815 -0.088 13.385 -0.088 13.736 0.264 C 14.088 0.615 14.088 1.185 13.736 1.536 L 8.272 7 L 13.736 12.464 C 14.088 12.815 14.088 13.385 13.736 13.736 C 13.385 14.088 12.815 14.088 12.463 13.736 L 7 8.273 L 1.536 13.736 C 1.185 14.088 0.615 14.088 0.263 13.736 C -0.088 13.385 -0.088 12.815 0.263 12.464 L 5.727 7 L 0.263 1.536 C -0.088 1.185 -0.088 0.615 0.263 0.264 Z");
        RectF rectF = new RectF();
        createPathFromPathData.computeBounds(rectF, true);
        Matrix matrix = new Matrix();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        matrix.postTranslate(-rectF.left, -rectF.top);
        float f2 = displayMetrics.density;
        matrix.postScale(f2, f2);
        matrix.postTranslate((f - (rectF.width() * f2)) / 2.0f, (f - (rectF.height() * f2)) / 2.0f);
        createPathFromPathData.transform(matrix);
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        canvas.drawPath(createPathFromPathData, paint2);
        return bitmap;
    }
}
