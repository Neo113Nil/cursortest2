package com.pubmatic.sdk.webrendering.mraid;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.safedk.android.internal.partials.PubMaticFilesBridge;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class POBMRAIDUtil {
    private static final String[] a = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ", "yyyy-MM-dd'T'HH:mmZ", "yyyy-MM-dd'T'HH:mmXXX"};

    static boolean a(Context context, Bitmap bitmap, String str) {
        FileOutputStream fileOutputStream;
        Uri fromFile;
        OutputStream outputStream = null;
        try {
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("title", str);
                    contentValues.put("_display_name", str);
                    contentValues.put("mime_type", "image/jpeg");
                    contentValues.put("date_added", Long.valueOf(System.currentTimeMillis() / 1000));
                    contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
                    ContentResolver contentResolver = context.getContentResolver();
                    fromFile = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                    if (fromFile != null) {
                        outputStream = contentResolver.openOutputStream(fromFile);
                    }
                } else {
                    File file = new File(String.valueOf(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)), str);
                    fileOutputStream = PubMaticFilesBridge.fileOutputStreamCtor(file);
                    try {
                        fromFile = Uri.fromFile(file);
                        outputStream = fileOutputStream;
                    } catch (Exception e) {
                        e = e;
                        outputStream = fileOutputStream;
                        POBLog.debug("POBMRAIDUtil", "Not able to store image : " + e.getLocalizedMessage(), new Object[0]);
                        if (outputStream != null) {
                            try {
                                outputStream.flush();
                                outputStream.close();
                            } catch (IOException unused) {
                                POBLog.debug("POBMRAIDUtil", "Unable to close the outputStream.", new Object[0]);
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                                POBLog.debug("POBMRAIDUtil", "Unable to close the outputStream.", new Object[0]);
                            }
                        }
                        throw th;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
            if (outputStream == null) {
                POBLog.debug("POBMRAIDUtil", "Not able to store image.", new Object[0]);
                if (outputStream != null) {
                    try {
                        outputStream.flush();
                        outputStream.close();
                    } catch (IOException unused3) {
                        POBLog.debug("POBMRAIDUtil", "Unable to close the outputStream.", new Object[0]);
                    }
                }
                return false;
            }
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream);
            outputStream.flush();
            outputStream.close();
            POBLog.debug("POBMRAIDUtil", "Image stored at :" + fromFile, new Object[0]);
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(fromFile);
            context.sendBroadcast(intent);
            try {
                outputStream.flush();
                outputStream.close();
                return true;
            } catch (IOException unused4) {
                POBLog.debug("POBMRAIDUtil", "Unable to close the outputStream.", new Object[0]);
                return true;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5 A[Catch: JSONException -> 0x00ea, TryCatch #0 {JSONException -> 0x00ea, blocks: (B:3:0x000f, B:5:0x0015, B:7:0x0020, B:8:0x002a, B:20:0x0069, B:22:0x0070, B:23:0x0079, B:25:0x007f, B:27:0x0089, B:28:0x0095, B:29:0x009a, B:31:0x009b, B:32:0x00a0, B:33:0x00a1, B:35:0x00a8, B:36:0x00b1, B:38:0x00b7, B:40:0x00c1, B:41:0x00cd, B:42:0x00d4, B:43:0x00d5, B:45:0x00dc, B:46:0x0040, B:49:0x004a, B:52:0x0054), top: B:2:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String b(JSONObject jSONObject) {
        char c;
        StringBuilder sb = new StringBuilder();
        try {
            if (jSONObject.has("frequency")) {
                String string = jSONObject.getString("frequency");
                int parseInt = jSONObject.has("interval") ? Integer.parseInt(jSONObject.getString("interval")) : -1;
                int hashCode = string.hashCode();
                if (hashCode == -791707519) {
                    if (string.equals("weekly")) {
                        c = 1;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else if (hashCode != 95346201) {
                    if (hashCode == 1236635661 && string.equals("monthly")) {
                        c = 2;
                        if (c != 0) {
                            sb.append("FREQ=DAILY;");
                            if (parseInt != -1) {
                                sb.append("INTERVAL=");
                                sb.append(parseInt);
                                sb.append(";");
                            }
                        } else if (c == 1) {
                            sb.append("FREQ=WEEKLY;");
                            if (parseInt != -1) {
                                sb.append("INTERVAL=");
                                sb.append(parseInt);
                                sb.append(";");
                            }
                            if (jSONObject.has("daysInWeek")) {
                                String b = b(jSONObject.getJSONArray("daysInWeek"));
                                if (b == null) {
                                    throw new IllegalArgumentException("invalid ");
                                }
                                sb.append("BYDAY=");
                                sb.append(b);
                                sb.append(";");
                            }
                        } else {
                            if (c != 2) {
                                throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
                            }
                            sb.append("FREQ=MONTHLY;");
                            if (parseInt != -1) {
                                sb.append("INTERVAL=");
                                sb.append(parseInt);
                                sb.append(";");
                            }
                            if (jSONObject.has("daysInMonth")) {
                                String a2 = a(jSONObject.getJSONArray("daysInMonth"));
                                if (a2 == null) {
                                    throw new IllegalArgumentException();
                                }
                                sb.append("BYMONTHDAY=");
                                sb.append(a2);
                                sb.append(";");
                            }
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else {
                    if (string.equals("daily")) {
                        c = 0;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                }
            }
            return sb.toString();
        } catch (JSONException unused) {
            throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
        }
    }

    @NonNull
    protected static JSONObject getHeightWidthJson(int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", i);
            jSONObject.put("height", i2);
            return jSONObject;
        } catch (JSONException unused) {
            POBLog.error("POBMRAIDUtil", "JSON Exception, Not able to generate JSON for given width :" + i + " and height " + i2 + " !", new Object[0]);
            return jSONObject;
        }
    }

    @NonNull
    protected static String getMRAIDEnvironment(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", "3.0");
            jSONObject.put("sdk", "PubMatic_OpenWrap_SDK");
            jSONObject.put("sdkVersion", "5.1.2");
            if (str != null) {
                jSONObject.put("appId", str);
            }
            if (str2 != null) {
                jSONObject.put("ifa", str2);
            }
            if (bool != null) {
                jSONObject.put("limitAdTracking", bool);
            }
            if (bool2 != null) {
                jSONObject.put("coppa", bool2);
            }
        } catch (JSONException unused) {
            POBLog.error("POBMRAIDUtil", "JSON Exception, not able to generate MRAID environment.", new Object[0]);
        }
        return "<script> window.MRAID_ENV = " + jSONObject + "</script>";
    }

    @NonNull
    protected static JSONObject getRectJson(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", i3);
            jSONObject.put("height", i4);
            jSONObject.put(VastAttributes.HORIZONTAL_POSITION, i);
            jSONObject.put(VastAttributes.VERTICAL_POSITION, i2);
            return jSONObject;
        } catch (JSONException unused) {
            POBLog.error("POBMRAIDUtil", "JSON Exception, Not able to generate JSON for x:" + i + " ,y:" + i2 + " ,width:" + i3 + " ,height:" + i4 + " !", new Object[0]);
            return jSONObject;
        }
    }

    @NonNull
    protected static POBViewRect getResizeValues(int i, int i2, int i3, int i4, boolean z, @NonNull POBViewRect pOBViewRect, int i5, int i6) {
        int i7;
        int screenWidth = POBUtils.getScreenWidth();
        int screenHeight = POBUtils.getScreenHeight();
        int i8 = i + pOBViewRect.getxPosition();
        int i9 = i2 + pOBViewRect.getyPosition();
        int i10 = 0;
        if (i3 >= screenWidth && i4 >= screenHeight) {
            return new POBViewRect(false, "Size must be smaller than the max size.");
        }
        if (i3 < 50 || i4 < 50) {
            return new POBViewRect(false, "Size must be greater than the 50x50 size.");
        }
        if (z) {
            int i11 = i8 + i3;
            if (i11 < i5 || i11 > screenWidth || i9 < 0 || i9 > screenHeight - i6) {
                return new POBViewRect(false, "Not able to show Close Button! No Space for close Button.");
            }
        } else {
            if (i3 > screenWidth) {
                i3 = screenWidth;
            }
            if (i4 > screenHeight) {
                i4 = screenHeight;
            }
            if (i8 < 0) {
                i7 = 0;
            } else {
                if (i8 + i3 > screenWidth) {
                    i7 = (int) (i8 - (r11 - screenWidth));
                } else {
                    i7 = i8;
                }
            }
            if (i9 >= 0) {
                if (i9 + i4 > screenHeight) {
                    i10 = (int) (i9 - (r12 - screenHeight));
                } else {
                    i10 = i9;
                }
            }
            i8 = (int) (i8 - (i8 - i7));
            i9 = (int) (i9 - (i9 - i10));
        }
        return new POBViewRect(POBUtils.convertDpToPixel(i8), POBUtils.convertDpToPixel(i9), POBUtils.convertDpToPixel(i4), POBUtils.convertDpToPixel(i3), true, "Ok");
    }

    static Map a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject.has("description")) {
            hashMap.put("title", jSONObject.getString("description"));
            if (jSONObject.has("start") && jSONObject.getString("start") != null) {
                Date a2 = a(jSONObject.getString("start"));
                if (a2 != null) {
                    hashMap.put("beginTime", Long.valueOf(a2.getTime()));
                    if (jSONObject.has("end") && jSONObject.getString("end") != null) {
                        Date a3 = a(jSONObject.getString("end"));
                        if (a3 != null) {
                            hashMap.put("endTime", Long.valueOf(a3.getTime()));
                        } else {
                            POBLog.error("POBMRAIDUtil", "Invalid end format. end must be(yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx)", new Object[0]);
                        }
                        if (jSONObject.has("location")) {
                            hashMap.put("eventLocation", jSONObject.getString("location"));
                        }
                        if (jSONObject.has("summary")) {
                            hashMap.put("description", jSONObject.getString("summary"));
                        }
                        if (jSONObject.has("transparency")) {
                            hashMap.put("availability", Integer.valueOf(jSONObject.getString("transparency").equals(X3.i.T) ? 1 : 0));
                        }
                        if (jSONObject.has("recurrence")) {
                            hashMap.put("rrule", b(jSONObject.getJSONObject("recurrence")));
                        }
                        return hashMap;
                    }
                    throw new IllegalArgumentException("Invalid end.end can't be null.");
                }
                POBLog.error("POBMRAIDUtil", "Invalid start format. start must be(yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx)", new Object[0]);
                throw new IllegalArgumentException("Invalid start format. start must be(yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx)");
            }
            throw new IllegalArgumentException("Invalid start. start can't be null.");
        }
        throw new IllegalArgumentException("Invalid description. Description can't be null.");
    }

    private static String b(JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            POBLog.error("POBMRAIDUtil", "Must have at least 1 day of the week if specifying repeating weekly.", new Object[0]);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean[] zArr = new boolean[7];
        for (int i = 0; i < jSONArray.length(); i++) {
            int optInt = jSONArray.optInt(i);
            if (optInt == 7) {
                optInt = 0;
            }
            if (!zArr[optInt]) {
                sb.append(b(optInt));
                sb.append(StringUtils.COMMA);
                zArr[optInt] = true;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private static Date a(String str) {
        Date date = null;
        for (String str2 : a) {
            try {
                date = new SimpleDateFormat(str2, Locale.US).parse(str);
            } catch (ParseException e) {
                POBLog.error("POBMRAIDUtil", "Not able to parse date. %s", e.getLocalizedMessage());
            }
            if (date != null) {
                break;
            }
        }
        return date;
    }

    private static String a(JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            POBLog.error("POBMRAIDUtil", "must have at least 1 day of the month if specifying repeating weekly", new Object[0]);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean[] zArr = new boolean[63];
        for (int i = 0; i < jSONArray.length(); i++) {
            int optInt = jSONArray.optInt(i);
            int i2 = optInt + 31;
            if (!zArr[i2]) {
                sb.append(a(optInt));
                sb.append(StringUtils.COMMA);
                zArr[i2] = true;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private static String b(int i) {
        switch (i) {
            case 0:
                return "SU";
            case 1:
                return "MO";
            case 2:
                return "TU";
            case 3:
                return "WE";
            case 4:
                return "TH";
            case 5:
                return "FR";
            case 6:
                return "SA";
            default:
                POBLog.error("POBMRAIDUtil", "invalid day of week %s", Integer.valueOf(i));
                return null;
        }
    }

    private static String a(int i) {
        if (i != 0 && i >= -31 && i <= 31) {
            return "" + i;
        }
        POBLog.error("POBMRAIDUtil", "invalid day of month " + i, new Object[0]);
        return null;
    }

    static boolean a(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return false;
            }
            return telephonyManager.getSimState() != 1;
        } catch (Exception e) {
            POBLog.warn("POBMRAIDUtil", "Not able to get TelephonyManager. Error: %s", e.getMessage());
            return false;
        }
    }
}
