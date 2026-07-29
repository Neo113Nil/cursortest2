package o;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import com.squareup.moshi.Json;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* renamed from: o.jl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1319jl {
    public static final byte[] A;
    public static final String[] B;
    public static final int[] C;
    public static final byte[] D;
    public static final C1123gl E;
    public static final C1123gl[][] F;
    public static final C1123gl[] G;
    public static final HashMap[] H;
    public static final HashMap[] I;
    public static final Set J;
    public static final HashMap K;
    public static final Charset L;
    public static final byte[] M;
    public static final byte[] N;
    public static final boolean l = Log.isLoggable("ExifInterface", 3);
    public static final int[] m;
    public static final int[] n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f187o;
    public static final byte[] p;
    public static final byte[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final byte[] t;
    public static final byte[] u;
    public static final byte[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;
    public final FileDescriptor a;
    public int b;
    public final HashMap[] c;
    public final HashSet d;
    public ByteOrder e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public C1057fl k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        m = new int[]{8, 8, 8};
        n = new int[]{8};
        f187o = new byte[]{-1, -40, -1};
        p = new byte[]{102, 116, 121, 112};
        q = new byte[]{109, 105, 102, 49};
        r = new byte[]{104, 101, 105, 99};
        s = new byte[]{97, 118, 105, 102};
        t = new byte[]{97, 118, 105, 115};
        u = new byte[]{79, 76, 89, 77, 80, 0};
        v = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        w = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        x = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        y = new byte[]{82, 73, 70, 70};
        z = new byte[]{87, 69, 66, 80};
        A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C1123gl[] c1123glArr = {new C1123gl("NewSubfileType", 254, 4), new C1123gl("SubfileType", 255, 4), new C1123gl(256, 3, 4, "ImageWidth"), new C1123gl(257, 3, 4, "ImageLength"), new C1123gl("BitsPerSample", 258, 3), new C1123gl("Compression", 259, 3), new C1123gl("PhotometricInterpretation", 262, 3), new C1123gl("ImageDescription", 270, 2), new C1123gl("Make", 271, 2), new C1123gl("Model", 272, 2), new C1123gl(273, 3, 4, "StripOffsets"), new C1123gl("Orientation", 274, 3), new C1123gl("SamplesPerPixel", 277, 3), new C1123gl(278, 3, 4, "RowsPerStrip"), new C1123gl(279, 3, 4, "StripByteCounts"), new C1123gl("XResolution", 282, 5), new C1123gl("YResolution", 283, 5), new C1123gl("PlanarConfiguration", 284, 3), new C1123gl("ResolutionUnit", 296, 3), new C1123gl("TransferFunction", 301, 3), new C1123gl("Software", 305, 2), new C1123gl("DateTime", 306, 2), new C1123gl("Artist", 315, 2), new C1123gl("WhitePoint", 318, 5), new C1123gl("PrimaryChromaticities", 319, 5), new C1123gl("SubIFDPointer", 330, 4), new C1123gl("JPEGInterchangeFormat", 513, 4), new C1123gl("JPEGInterchangeFormatLength", 514, 4), new C1123gl("YCbCrCoefficients", 529, 5), new C1123gl("YCbCrSubSampling", 530, 3), new C1123gl("YCbCrPositioning", 531, 3), new C1123gl("ReferenceBlackWhite", 532, 5), new C1123gl("Copyright", 33432, 2), new C1123gl("ExifIFDPointer", 34665, 4), new C1123gl("GPSInfoIFDPointer", 34853, 4), new C1123gl("SensorTopBorder", 4, 4), new C1123gl("SensorLeftBorder", 5, 4), new C1123gl("SensorBottomBorder", 6, 4), new C1123gl("SensorRightBorder", 7, 4), new C1123gl("ISO", 23, 3), new C1123gl("JpgFromRaw", 46, 7), new C1123gl("Xmp", 700, 1)};
        C1123gl[] c1123glArr2 = {new C1123gl("ExposureTime", 33434, 5), new C1123gl("FNumber", 33437, 5), new C1123gl("ExposureProgram", 34850, 3), new C1123gl("SpectralSensitivity", 34852, 2), new C1123gl("PhotographicSensitivity", 34855, 3), new C1123gl("OECF", 34856, 7), new C1123gl("SensitivityType", 34864, 3), new C1123gl("StandardOutputSensitivity", 34865, 4), new C1123gl("RecommendedExposureIndex", 34866, 4), new C1123gl("ISOSpeed", 34867, 4), new C1123gl("ISOSpeedLatitudeyyy", 34868, 4), new C1123gl("ISOSpeedLatitudezzz", 34869, 4), new C1123gl("ExifVersion", 36864, 2), new C1123gl("DateTimeOriginal", 36867, 2), new C1123gl("DateTimeDigitized", 36868, 2), new C1123gl("OffsetTime", 36880, 2), new C1123gl("OffsetTimeOriginal", 36881, 2), new C1123gl("OffsetTimeDigitized", 36882, 2), new C1123gl("ComponentsConfiguration", 37121, 7), new C1123gl("CompressedBitsPerPixel", 37122, 5), new C1123gl("ShutterSpeedValue", 37377, 10), new C1123gl("ApertureValue", 37378, 5), new C1123gl("BrightnessValue", 37379, 10), new C1123gl("ExposureBiasValue", 37380, 10), new C1123gl("MaxApertureValue", 37381, 5), new C1123gl("SubjectDistance", 37382, 5), new C1123gl("MeteringMode", 37383, 3), new C1123gl("LightSource", 37384, 3), new C1123gl("Flash", 37385, 3), new C1123gl("FocalLength", 37386, 5), new C1123gl("SubjectArea", 37396, 3), new C1123gl("MakerNote", 37500, 7), new C1123gl("UserComment", 37510, 7), new C1123gl("SubSecTime", 37520, 2), new C1123gl("SubSecTimeOriginal", 37521, 2), new C1123gl("SubSecTimeDigitized", 37522, 2), new C1123gl("FlashpixVersion", 40960, 7), new C1123gl("ColorSpace", 40961, 3), new C1123gl(40962, 3, 4, "PixelXDimension"), new C1123gl(40963, 3, 4, "PixelYDimension"), new C1123gl("RelatedSoundFile", 40964, 2), new C1123gl("InteroperabilityIFDPointer", 40965, 4), new C1123gl("FlashEnergy", 41483, 5), new C1123gl("SpatialFrequencyResponse", 41484, 7), new C1123gl("FocalPlaneXResolution", 41486, 5), new C1123gl("FocalPlaneYResolution", 41487, 5), new C1123gl("FocalPlaneResolutionUnit", 41488, 3), new C1123gl("SubjectLocation", 41492, 3), new C1123gl("ExposureIndex", 41493, 5), new C1123gl("SensingMethod", 41495, 3), new C1123gl("FileSource", 41728, 7), new C1123gl("SceneType", 41729, 7), new C1123gl("CFAPattern", 41730, 7), new C1123gl("CustomRendered", 41985, 3), new C1123gl("ExposureMode", 41986, 3), new C1123gl("WhiteBalance", 41987, 3), new C1123gl("DigitalZoomRatio", 41988, 5), new C1123gl("FocalLengthIn35mmFilm", 41989, 3), new C1123gl("SceneCaptureType", 41990, 3), new C1123gl("GainControl", 41991, 3), new C1123gl("Contrast", 41992, 3), new C1123gl("Saturation", 41993, 3), new C1123gl("Sharpness", 41994, 3), new C1123gl("DeviceSettingDescription", 41995, 7), new C1123gl("SubjectDistanceRange", 41996, 3), new C1123gl("ImageUniqueID", 42016, 2), new C1123gl("CameraOwnerName", 42032, 2), new C1123gl("BodySerialNumber", 42033, 2), new C1123gl("LensSpecification", 42034, 5), new C1123gl("LensMake", 42035, 2), new C1123gl("LensModel", 42036, 2), new C1123gl("Gamma", 42240, 5), new C1123gl("DNGVersion", 50706, 1), new C1123gl(50720, 3, 4, "DefaultCropSize")};
        C1123gl[] c1123glArr3 = {new C1123gl("GPSVersionID", 0, 1), new C1123gl("GPSLatitudeRef", 1, 2), new C1123gl(2, 5, 10, "GPSLatitude"), new C1123gl("GPSLongitudeRef", 3, 2), new C1123gl(4, 5, 10, "GPSLongitude"), new C1123gl("GPSAltitudeRef", 5, 1), new C1123gl("GPSAltitude", 6, 5), new C1123gl("GPSTimeStamp", 7, 5), new C1123gl("GPSSatellites", 8, 2), new C1123gl("GPSStatus", 9, 2), new C1123gl("GPSMeasureMode", 10, 2), new C1123gl("GPSDOP", 11, 5), new C1123gl("GPSSpeedRef", 12, 2), new C1123gl("GPSSpeed", 13, 5), new C1123gl("GPSTrackRef", 14, 2), new C1123gl("GPSTrack", 15, 5), new C1123gl("GPSImgDirectionRef", 16, 2), new C1123gl("GPSImgDirection", 17, 5), new C1123gl("GPSMapDatum", 18, 2), new C1123gl("GPSDestLatitudeRef", 19, 2), new C1123gl("GPSDestLatitude", 20, 5), new C1123gl("GPSDestLongitudeRef", 21, 2), new C1123gl("GPSDestLongitude", 22, 5), new C1123gl("GPSDestBearingRef", 23, 2), new C1123gl("GPSDestBearing", 24, 5), new C1123gl("GPSDestDistanceRef", 25, 2), new C1123gl("GPSDestDistance", 26, 5), new C1123gl("GPSProcessingMethod", 27, 7), new C1123gl("GPSAreaInformation", 28, 7), new C1123gl("GPSDateStamp", 29, 2), new C1123gl("GPSDifferential", 30, 3), new C1123gl("GPSHPositioningError", 31, 5)};
        C1123gl[] c1123glArr4 = {new C1123gl("InteroperabilityIndex", 1, 2)};
        C1123gl[] c1123glArr5 = {new C1123gl("NewSubfileType", 254, 4), new C1123gl("SubfileType", 255, 4), new C1123gl(256, 3, 4, "ThumbnailImageWidth"), new C1123gl(257, 3, 4, "ThumbnailImageLength"), new C1123gl("BitsPerSample", 258, 3), new C1123gl("Compression", 259, 3), new C1123gl("PhotometricInterpretation", 262, 3), new C1123gl("ImageDescription", 270, 2), new C1123gl("Make", 271, 2), new C1123gl("Model", 272, 2), new C1123gl(273, 3, 4, "StripOffsets"), new C1123gl("ThumbnailOrientation", 274, 3), new C1123gl("SamplesPerPixel", 277, 3), new C1123gl(278, 3, 4, "RowsPerStrip"), new C1123gl(279, 3, 4, "StripByteCounts"), new C1123gl("XResolution", 282, 5), new C1123gl("YResolution", 283, 5), new C1123gl("PlanarConfiguration", 284, 3), new C1123gl("ResolutionUnit", 296, 3), new C1123gl("TransferFunction", 301, 3), new C1123gl("Software", 305, 2), new C1123gl("DateTime", 306, 2), new C1123gl("Artist", 315, 2), new C1123gl("WhitePoint", 318, 5), new C1123gl("PrimaryChromaticities", 319, 5), new C1123gl("SubIFDPointer", 330, 4), new C1123gl("JPEGInterchangeFormat", 513, 4), new C1123gl("JPEGInterchangeFormatLength", 514, 4), new C1123gl("YCbCrCoefficients", 529, 5), new C1123gl("YCbCrSubSampling", 530, 3), new C1123gl("YCbCrPositioning", 531, 3), new C1123gl("ReferenceBlackWhite", 532, 5), new C1123gl("Copyright", 33432, 2), new C1123gl("ExifIFDPointer", 34665, 4), new C1123gl("GPSInfoIFDPointer", 34853, 4), new C1123gl("DNGVersion", 50706, 1), new C1123gl(50720, 3, 4, "DefaultCropSize")};
        E = new C1123gl("StripOffsets", 273, 3);
        F = new C1123gl[][]{c1123glArr, c1123glArr2, c1123glArr3, c1123glArr4, c1123glArr5, c1123glArr, new C1123gl[]{new C1123gl("ThumbnailImage", 256, 7), new C1123gl("CameraSettingsIFDPointer", 8224, 4), new C1123gl("ImageProcessingIFDPointer", 8256, 4)}, new C1123gl[]{new C1123gl("PreviewImageStart", 257, 4), new C1123gl("PreviewImageLength", 258, 4)}, new C1123gl[]{new C1123gl("AspectFrame", 4371, 3)}, new C1123gl[]{new C1123gl("ColorSpace", 55, 3)}};
        G = new C1123gl[]{new C1123gl("SubIFDPointer", 330, 4), new C1123gl("ExifIFDPointer", 34665, 4), new C1123gl("GPSInfoIFDPointer", 34853, 4), new C1123gl("InteroperabilityIFDPointer", 40965, 4), new C1123gl("CameraSettingsIFDPointer", 8224, 1), new C1123gl("ImageProcessingIFDPointer", 8256, 1)};
        H = new HashMap[10];
        I = new HashMap[10];
        J = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        K = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        L = forName;
        M = "Exif\u0000\u0000".getBytes(forName);
        N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C1123gl[][] c1123glArr6 = F;
            if (i >= c1123glArr6.length) {
                HashMap hashMap = K;
                C1123gl[] c1123glArr7 = G;
                hashMap.put(Integer.valueOf(c1123glArr7[0].a), 5);
                hashMap.put(Integer.valueOf(c1123glArr7[1].a), 1);
                hashMap.put(Integer.valueOf(c1123glArr7[2].a), 2);
                hashMap.put(Integer.valueOf(c1123glArr7[3].a), 3);
                hashMap.put(Integer.valueOf(c1123glArr7[4].a), 7);
                hashMap.put(Integer.valueOf(c1123glArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            H[i] = new HashMap();
            I[i] = new HashMap();
            for (C1123gl c1123gl : c1123glArr6[i]) {
                H[i].put(Integer.valueOf(c1123gl.a), c1123gl);
                I[i].put(c1123gl.b, c1123gl);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad A[Catch: all -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002e, blocks: (B:3:0x001f, B:5:0x0022, B:7:0x0037, B:13:0x0054, B:20:0x0067, B:21:0x007a, B:30:0x006f, B:31:0x0073, B:32:0x0077, B:33:0x0084, B:35:0x008d, B:37:0x0093, B:39:0x0099, B:41:0x009f, B:51:0x00ad), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1319jl(ByteArrayInputStream byteArrayInputStream) {
        C1123gl[][] c1123glArr = F;
        this.c = new HashMap[c1123glArr.length];
        this.d = new HashSet(c1123glArr.length);
        this.e = ByteOrder.BIG_ENDIAN;
        boolean z2 = l;
        this.a = null;
        for (int i = 0; i < c1123glArr.length; i++) {
            try {
                try {
                    this.c[i] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z2) {
                        p();
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z2) {
                    return;
                }
                p();
            } catch (UnsupportedOperationException e2) {
                e = e2;
                if (z2) {
                }
                a();
                if (!z2) {
                }
                p();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream, 5000);
        int f = f(bufferedInputStream);
        this.b = f;
        if (f != 4 && f != 9 && f != 13 && f != 14) {
            C1254il c1254il = new C1254il(bufferedInputStream);
            int i2 = this.b;
            if (i2 != 12 && i2 != 15) {
                if (i2 == 7) {
                    g(c1254il);
                } else if (i2 == 10) {
                    k(c1254il);
                } else {
                    j(c1254il);
                }
                c1254il.c(this.g);
                u(c1254il);
                a();
                if (!z2) {
                    return;
                }
                p();
            }
            d(c1254il, i2);
            c1254il.c(this.g);
            u(c1254il);
            a();
            if (!z2) {
            }
            p();
        }
        C0991el c0991el = new C0991el(bufferedInputStream);
        int i3 = this.b;
        if (i3 == 4) {
            e(c0991el, 0, 0);
        } else if (i3 == 13) {
            h(c0991el);
        } else if (i3 == 9) {
            i(c0991el);
        } else if (i3 == 14) {
            l(c0991el);
        }
        a();
        if (!z2) {
        }
        p();
    }

    public static ByteOrder q(C0991el c0991el) {
        short readShort = c0991el.readShort();
        boolean z2 = l;
        if (readShort == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void a() {
        String b = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.c;
        if (b != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b.concat(Json.UNSET_NAME).getBytes(L);
            hashMap.put("DateTime", new C1057fl(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", C1057fl.a(0L, this.e));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", C1057fl.a(0L, this.e));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", C1057fl.a(0L, this.e));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", C1057fl.a(0L, this.e));
        }
    }

    public final String b(String str) {
        C1057fl c = c(str);
        if (c != null) {
            int i = c.a;
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                C1189hl[] c1189hlArr = (C1189hl[]) c.g(this.e);
                if (c1189hlArr == null || c1189hlArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c1189hlArr));
                    return null;
                }
                C1189hl c1189hl = c1189hlArr[0];
                Integer valueOf = Integer.valueOf((int) (c1189hl.a / c1189hl.b));
                C1189hl c1189hl2 = c1189hlArr[1];
                Integer valueOf2 = Integer.valueOf((int) (c1189hl2.a / c1189hl2.b));
                C1189hl c1189hl3 = c1189hlArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (c1189hl3.a / c1189hl3.b)));
            }
            if (!J.contains(str)) {
                return c.f(this.e);
            }
            try {
                return Double.toString(c.d(this.e));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final C1057fl c(String str) {
        C1057fl c1057fl;
        int i;
        C1057fl c1057fl2;
        if ("ISOSpeedRatings".equals(str)) {
            if (l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.b) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (c1057fl2 = this.k) != null)) {
            return c1057fl2;
        }
        for (int i2 = 0; i2 < F.length; i2++) {
            C1057fl c1057fl3 = (C1057fl) this.c[i2].get(str);
            if (c1057fl3 != null) {
                return c1057fl3;
            }
        }
        if (!"Xmp".equals(str) || (c1057fl = this.k) == null) {
            return null;
        }
        return c1057fl;
    }

    public final void d(C1254il c1254il, int i) {
        String str;
        String str2;
        String str3;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i == 15 && i2 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new C0926dl(c1254il));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str3 = mediaMetadataRetriever.extractMetadata(30);
                    str2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str3 = mediaMetadataRetriever.extractMetadata(19);
                    str2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.c;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", C1057fl.c(Integer.parseInt(str), this.e));
                }
                if (str3 != null) {
                    hashMapArr[0].put("ImageLength", C1057fl.c(Integer.parseInt(str3), this.e));
                }
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    hashMapArr[0].put("Orientation", C1057fl.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.e));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c1254il.c(parseInt2);
                    byte[] bArr = new byte[6];
                    c1254il.readFully(bArr);
                    int i3 = parseInt2 + 6;
                    int i4 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i4];
                    c1254il.readFully(bArr2);
                    this.g = i3;
                    r(bArr2, 0);
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j = parseInt4;
                    c1254il.c(j);
                    byte[] bArr3 = new byte[parseInt5];
                    c1254il.readFully(bArr3);
                    this.k = new C1057fl(j, bArr3, 1, parseInt5);
                }
                if (l) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str3 + ", rotation " + str2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x016b, code lost:
    
        r23.j = r22.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016f, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x009e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x00a1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x00a4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0158 A[LOOP:0: B:9:0x0034->B:32:0x0158, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(C0991el c0991el, int i, int i2) {
        boolean z2 = l;
        if (z2) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + c0991el);
        }
        c0991el.j = ByteOrder.BIG_ENDIAN;
        byte readByte = c0991el.readByte();
        byte b = -1;
        if (readByte != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        if (c0991el.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        int i3 = 2;
        while (true) {
            byte readByte2 = c0991el.readByte();
            if (readByte2 != b) {
                throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
            }
            byte readByte3 = c0991el.readByte();
            if (z2) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = c0991el.readUnsignedShort();
                int i4 = readUnsignedShort - 2;
                int i5 = i3 + 4;
                if (z2) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                }
                if (i4 < 0) {
                    throw new IOException("Invalid length");
                }
                if (readByte3 != -31) {
                    HashMap[] hashMapArr = this.c;
                    if (readByte3 != -2) {
                        switch (readByte3) {
                            default:
                                switch (readByte3) {
                                    default:
                                        switch (readByte3) {
                                            default:
                                                switch (readByte3) {
                                                }
                                            case -55:
                                            case -54:
                                            case -53:
                                                c0991el.b(1);
                                                hashMapArr[i2].put(i2 != 4 ? "ImageLength" : "ThumbnailImageLength", C1057fl.a(c0991el.readUnsignedShort(), this.e));
                                                hashMapArr[i2].put(i2 != 4 ? "ImageWidth" : "ThumbnailImageWidth", C1057fl.a(c0991el.readUnsignedShort(), this.e));
                                                i4 = readUnsignedShort - 7;
                                                break;
                                        }
                                    case -59:
                                    case -58:
                                    case -57:
                                        break;
                                }
                            case -64:
                            case -63:
                            case -62:
                            case -61:
                                break;
                        }
                        if (i4 >= 0) {
                            throw new IOException("Invalid length");
                        }
                        c0991el.b(i4);
                        i3 = i5 + i4;
                        b = -1;
                    } else {
                        byte[] bArr = new byte[i4];
                        c0991el.readFully(bArr);
                        if (b("UserComment") == null) {
                            HashMap hashMap = hashMapArr[1];
                            Charset charset = L;
                            byte[] bytes = new String(bArr, charset).concat(Json.UNSET_NAME).getBytes(charset);
                            hashMap.put("UserComment", new C1057fl(bytes, 2, bytes.length));
                        }
                    }
                } else {
                    byte[] bArr2 = new byte[i4];
                    c0991el.readFully(bArr2);
                    int i6 = i5 + i4;
                    byte[] bArr3 = M;
                    if (AbstractC1473m3.Z(bArr2, bArr3)) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, bArr3.length, i4);
                        this.g = i + i5 + bArr3.length;
                        r(copyOfRange, i2);
                        u(new C0991el(copyOfRange));
                    } else {
                        byte[] bArr4 = N;
                        if (AbstractC1473m3.Z(bArr2, bArr4)) {
                            int length = i5 + bArr4.length;
                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, bArr4.length, i4);
                            this.k = new C1057fl(length, copyOfRange2, 1, copyOfRange2.length);
                        }
                    }
                    i5 = i6;
                }
                i4 = 0;
                if (i4 >= 0) {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0062, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00ec, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(BufferedInputStream bufferedInputStream) {
        C0991el c0991el;
        int i;
        C0991el c0991el2;
        int i2;
        C0991el c0991el3;
        C0991el c0991el4;
        int i3;
        C0991el c0991el5;
        C0991el c0991el6;
        int i4;
        int i5;
        long readInt;
        byte[] bArr;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i6 = 0;
        while (true) {
            byte[] bArr3 = f187o;
            if (i6 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i6] != bArr3[i6]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i7 = 0; i7 < bytes.length; i7++) {
                    if (bArr2[i7] != bytes[i7]) {
                        int i8 = 1;
                        try {
                            c0991el2 = new C0991el(bArr2);
                            try {
                                try {
                                    readInt = c0991el2.readInt();
                                    bArr = new byte[4];
                                    c0991el2.readFully(bArr);
                                } catch (Exception e) {
                                    e = e;
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                c0991el = c0991el2;
                                if (c0991el != null) {
                                    c0991el.close();
                                }
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i = 0;
                            c0991el2 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            c0991el = null;
                        }
                        if (Arrays.equals(bArr, p)) {
                            if (readInt == 1) {
                                readInt = c0991el2.readLong();
                                j = 16;
                            } else {
                                j = 8;
                            }
                            i = 0;
                            long j2 = 5000;
                            if (readInt > j2) {
                                readInt = j2;
                            }
                            long j3 = readInt - j;
                            if (j3 >= 8) {
                                try {
                                    byte[] bArr4 = new byte[4];
                                    boolean z2 = false;
                                    boolean z3 = false;
                                    boolean z4 = false;
                                    for (long j4 = 0; j4 < j3 / 4; j4++) {
                                        try {
                                            c0991el2.readFully(bArr4);
                                            if (j4 != 1) {
                                                if (Arrays.equals(bArr4, q)) {
                                                    z2 = true;
                                                } else if (Arrays.equals(bArr4, r)) {
                                                    z3 = true;
                                                } else if (Arrays.equals(bArr4, s) || Arrays.equals(bArr4, t)) {
                                                    z4 = true;
                                                }
                                                if (z2) {
                                                    if (z3) {
                                                        c0991el2.close();
                                                        i2 = 12;
                                                        break;
                                                    }
                                                    if (z4) {
                                                        c0991el2.close();
                                                        i2 = 15;
                                                        break;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        } catch (EOFException unused) {
                                        }
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    if (l) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                }
                            }
                            c0991el2.close();
                            i2 = i;
                            if (i2 == 0) {
                                return i2;
                            }
                            try {
                                c0991el4 = new C0991el(bArr2);
                                try {
                                    ByteOrder q2 = q(c0991el4);
                                    this.e = q2;
                                    c0991el4.j = q2;
                                    short readShort = c0991el4.readShort();
                                    i3 = (readShort == 20306 || readShort == 21330) ? 1 : i;
                                    c0991el4.close();
                                } catch (Exception unused2) {
                                    if (c0991el4 != null) {
                                        c0991el4.close();
                                    }
                                    i3 = i;
                                    if (i3 == 0) {
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c0991el3 = c0991el4;
                                    if (c0991el3 != null) {
                                        c0991el3.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused3) {
                                c0991el4 = null;
                            } catch (Throwable th4) {
                                th = th4;
                                c0991el3 = null;
                            }
                            if (i3 == 0) {
                                return 7;
                            }
                            try {
                                C0991el c0991el7 = new C0991el(bArr2);
                                try {
                                    ByteOrder q3 = q(c0991el7);
                                    this.e = q3;
                                    c0991el7.j = q3;
                                    i4 = c0991el7.readShort() == 85 ? 1 : i;
                                    c0991el7.close();
                                } catch (Exception unused4) {
                                    c0991el6 = c0991el7;
                                    if (c0991el6 != null) {
                                        c0991el6.close();
                                    }
                                    i4 = i;
                                    if (i4 == 0) {
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    c0991el5 = c0991el7;
                                    if (c0991el5 != null) {
                                        c0991el5.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused5) {
                                c0991el6 = null;
                            } catch (Throwable th6) {
                                th = th6;
                                c0991el5 = null;
                            }
                            if (i4 == 0) {
                                return 10;
                            }
                            int i9 = i;
                            while (true) {
                                byte[] bArr5 = w;
                                if (i9 >= bArr5.length) {
                                    i5 = 1;
                                    break;
                                }
                                if (bArr2[i9] != bArr5[i9]) {
                                    i5 = i;
                                    break;
                                }
                                i9++;
                            }
                            if (i5 != 0) {
                                return 13;
                            }
                            int i10 = i;
                            while (true) {
                                byte[] bArr6 = y;
                                if (i10 >= bArr6.length) {
                                    int i11 = i;
                                    while (true) {
                                        byte[] bArr7 = z;
                                        if (i11 >= bArr7.length) {
                                            break;
                                        }
                                        if (bArr2[bArr6.length + i11 + 4] != bArr7[i11]) {
                                            break;
                                        }
                                        i11++;
                                    }
                                } else {
                                    if (bArr2[i10] != bArr6[i10]) {
                                        break;
                                    }
                                    i10++;
                                }
                            }
                            i8 = i;
                            if (i8 != 0) {
                                return 14;
                            }
                            return i;
                        }
                        c0991el2.close();
                        i = 0;
                        i2 = 0;
                        if (i2 == 0) {
                        }
                    }
                }
                return 9;
            }
            i6++;
        }
    }

    public final void g(C1254il c1254il) {
        int i;
        int i2;
        j(c1254il);
        HashMap[] hashMapArr = this.c;
        C1057fl c1057fl = (C1057fl) hashMapArr[1].get("MakerNote");
        if (c1057fl != null) {
            C1254il c1254il2 = new C1254il(c1057fl.d);
            c1254il2.j = this.e;
            byte[] bArr = u;
            byte[] bArr2 = new byte[bArr.length];
            c1254il2.readFully(bArr2);
            c1254il2.c(0L);
            byte[] bArr3 = v;
            byte[] bArr4 = new byte[bArr3.length];
            c1254il2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c1254il2.c(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c1254il2.c(12L);
            }
            s(c1254il2, 6);
            C1057fl c1057fl2 = (C1057fl) hashMapArr[7].get("PreviewImageStart");
            C1057fl c1057fl3 = (C1057fl) hashMapArr[7].get("PreviewImageLength");
            if (c1057fl2 != null && c1057fl3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", c1057fl2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", c1057fl3);
            }
            C1057fl c1057fl4 = (C1057fl) hashMapArr[8].get("AspectFrame");
            if (c1057fl4 != null) {
                int[] iArr = (int[]) c1057fl4.g(this.e);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                C1057fl c = C1057fl.c(i5, this.e);
                C1057fl c2 = C1057fl.c(i6, this.e);
                hashMapArr[0].put("ImageWidth", c);
                hashMapArr[0].put("ImageLength", c2);
            }
        }
    }

    public final void h(C0991el c0991el) {
        if (l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c0991el);
        }
        c0991el.j = ByteOrder.BIG_ENDIAN;
        int i = c0991el.i;
        c0991el.b(w.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2 && z3) {
                return;
            }
            try {
                int readInt = c0991el.readInt();
                int readInt2 = c0991el.readInt();
                int i2 = c0991el.i;
                int i3 = i2 + readInt + 4;
                int i4 = i2 - i;
                if (i4 == 16 && readInt2 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (readInt2 == 1229278788) {
                    return;
                }
                if (readInt2 == 1700284774 && !z2) {
                    this.g = i4;
                    byte[] bArr = new byte[readInt];
                    c0991el.readFully(bArr);
                    int readInt3 = c0991el.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(readInt2 >>> 24);
                    crc32.update(readInt2 >>> 16);
                    crc32.update(readInt2 >>> 8);
                    crc32.update(readInt2);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != readInt3) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                    }
                    r(bArr, 0);
                    x();
                    u(new C0991el(bArr));
                    z2 = true;
                } else if (readInt2 == 1767135348 && !z3) {
                    byte[] bArr2 = x;
                    if (readInt >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        c0991el.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i5 = c0991el.i - i;
                            int i6 = readInt - length;
                            byte[] bArr4 = new byte[i6];
                            c0991el.readFully(bArr4);
                            this.k = new C1057fl(i5, bArr4, 1, i6);
                            z3 = true;
                        }
                    }
                }
                c0991el.b(i3 - c0991el.i);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.", e);
            }
        }
    }

    public final void i(C0991el c0991el) {
        boolean z2 = l;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c0991el);
        }
        c0991el.b(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c0991el.readFully(bArr);
        c0991el.readFully(bArr2);
        c0991el.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c0991el.b(i - c0991el.i);
        c0991el.readFully(bArr4);
        e(new C0991el(bArr4), i, 5);
        c0991el.b(i3 - c0991el.i);
        c0991el.j = ByteOrder.BIG_ENDIAN;
        int readInt = c0991el.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = c0991el.readUnsignedShort();
            int readUnsignedShort2 = c0991el.readUnsignedShort();
            if (readUnsignedShort == E.a) {
                short readShort = c0991el.readShort();
                short readShort2 = c0991el.readShort();
                C1057fl c = C1057fl.c(readShort, this.e);
                C1057fl c2 = C1057fl.c(readShort2, this.e);
                HashMap[] hashMapArr = this.c;
                hashMapArr[0].put("ImageLength", c);
                hashMapArr[0].put("ImageWidth", c2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            c0991el.b(readUnsignedShort2);
        }
    }

    public final void j(C1254il c1254il) {
        o(c1254il);
        s(c1254il, 0);
        w(c1254il, 0);
        w(c1254il, 5);
        w(c1254il, 4);
        x();
        if (this.b == 8) {
            HashMap[] hashMapArr = this.c;
            C1057fl c1057fl = (C1057fl) hashMapArr[1].get("MakerNote");
            if (c1057fl != null) {
                C1254il c1254il2 = new C1254il(c1057fl.d);
                c1254il2.j = this.e;
                c1254il2.b(6);
                s(c1254il2, 9);
                C1057fl c1057fl2 = (C1057fl) hashMapArr[9].get("ColorSpace");
                if (c1057fl2 != null) {
                    hashMapArr[1].put("ColorSpace", c1057fl2);
                }
            }
        }
    }

    public final void k(C1254il c1254il) {
        if (l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c1254il);
        }
        j(c1254il);
        HashMap[] hashMapArr = this.c;
        C1057fl c1057fl = (C1057fl) hashMapArr[0].get("JpgFromRaw");
        if (c1057fl != null) {
            e(new C0991el(c1057fl.d), (int) c1057fl.c, 5);
        }
        C1057fl c1057fl2 = (C1057fl) hashMapArr[0].get("ISO");
        C1057fl c1057fl3 = (C1057fl) hashMapArr[1].get("PhotographicSensitivity");
        if (c1057fl2 == null || c1057fl3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", c1057fl2);
    }

    public final void l(C0991el c0991el) {
        if (l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c0991el);
        }
        c0991el.j = ByteOrder.LITTLE_ENDIAN;
        c0991el.b(y.length);
        int readInt = c0991el.readInt() + 8;
        byte[] bArr = z;
        c0991el.b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c0991el.readFully(bArr2);
                int readInt2 = c0991el.readInt();
                int i = length + 8;
                if (Arrays.equals(A, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    c0991el.readFully(bArr3);
                    byte[] bArr4 = M;
                    if (AbstractC1473m3.Z(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.g = i;
                    r(bArr3, 0);
                    u(new C0991el(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c0991el.b(readInt2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    public final void m(C0991el c0991el, HashMap hashMap) {
        C1057fl c1057fl = (C1057fl) hashMap.get("JPEGInterchangeFormat");
        C1057fl c1057fl2 = (C1057fl) hashMap.get("JPEGInterchangeFormatLength");
        if (c1057fl == null || c1057fl2 == null) {
            return;
        }
        int e = c1057fl.e(this.e);
        int e2 = c1057fl2.e(this.e);
        if (this.b == 7) {
            e += this.h;
        }
        if (e > 0 && e2 > 0 && this.a == null) {
            c0991el.b(e);
            c0991el.readFully(new byte[e2]);
        }
        if (l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e + ", length: " + e2);
        }
    }

    public final boolean n(HashMap hashMap) {
        C1057fl c1057fl = (C1057fl) hashMap.get("ImageLength");
        C1057fl c1057fl2 = (C1057fl) hashMap.get("ImageWidth");
        if (c1057fl == null || c1057fl2 == null) {
            return false;
        }
        return c1057fl.e(this.e) <= 512 && c1057fl2.e(this.e) <= 512;
    }

    public final void o(C1254il c1254il) {
        ByteOrder q2 = q(c1254il);
        this.e = q2;
        c1254il.j = q2;
        int readUnsignedShort = c1254il.readUnsignedShort();
        int i = this.b;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = c1254il.readInt();
        if (readInt < 8) {
            throw new IOException(AbstractC2188wx.g(readInt, "Invalid first Ifd offset: "));
        }
        int i2 = readInt - 8;
        if (i2 > 0) {
            c1254il.b(i2);
        }
    }

    public final void p() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.c;
            if (i >= hashMapArr.length) {
                return;
            }
            StringBuilder i2 = AbstractC2188wx.i(i, "The size of tag group[", "]: ");
            i2.append(hashMapArr[i].size());
            Log.d("ExifInterface", i2.toString());
            for (Map.Entry entry : hashMapArr[i].entrySet()) {
                C1057fl c1057fl = (C1057fl) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c1057fl.toString() + ", tagValue: '" + c1057fl.f(this.e) + "'");
            }
            i++;
        }
    }

    public final void r(byte[] bArr, int i) {
        C1254il c1254il = new C1254il(bArr);
        o(c1254il);
        s(c1254il, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(C1254il c1254il, int i) {
        HashMap[] hashMapArr;
        HashSet hashSet;
        boolean z2;
        short s2;
        HashMap[] hashMapArr2;
        long j;
        long j2;
        boolean z3;
        int i2;
        long j3;
        int i3;
        C1123gl c1123gl;
        HashSet hashSet2;
        int readUnsignedShort;
        long j4;
        int i4 = i;
        int i5 = c1254il.i;
        int i6 = c1254il.l;
        Integer valueOf = Integer.valueOf(i5);
        HashSet hashSet3 = this.d;
        hashSet3.add(valueOf);
        short readShort = c1254il.readShort();
        boolean z4 = l;
        if (z4) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort <= 0) {
            return;
        }
        short s3 = 0;
        while (true) {
            hashMapArr = this.c;
            if (s3 >= readShort) {
                break;
            }
            int readUnsignedShort2 = c1254il.readUnsignedShort();
            int readUnsignedShort3 = c1254il.readUnsignedShort();
            int readInt = c1254il.readInt();
            long j5 = c1254il.i + 4;
            short s4 = readShort;
            C1123gl c1123gl2 = (C1123gl) H[i4].get(Integer.valueOf(readUnsignedShort2));
            if (z4) {
                z2 = z4;
                s2 = s3;
                hashMapArr2 = hashMapArr;
                hashSet = hashSet3;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i4), Integer.valueOf(readUnsignedShort2), c1123gl2 != null ? c1123gl2.b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
            } else {
                hashSet = hashSet3;
                z2 = z4;
                s2 = s3;
                hashMapArr2 = hashMapArr;
            }
            if (c1123gl2 != null) {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < C.length) {
                        int i7 = c1123gl2.c;
                        if (i7 == 7 || readUnsignedShort3 == 7 || i7 == readUnsignedShort3 || (i2 = c1123gl2.d) == readUnsignedShort3 || (((i7 == 4 || i2 == 4) && readUnsignedShort3 == 3) || (((i7 == 9 || i2 == 9) && readUnsignedShort3 == 8) || ((i7 == 12 || i2 == 12) && readUnsignedShort3 == 11)))) {
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = i7;
                            }
                            j = j5;
                            j2 = readInt * r7[readUnsignedShort3];
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z2) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                                }
                                z3 = false;
                                if (z3) {
                                    c1254il.c(j);
                                    hashSet2 = hashSet;
                                } else {
                                    long j6 = j;
                                    if (j2 > 4) {
                                        int readInt2 = c1254il.readInt();
                                        if (z2) {
                                            i3 = readUnsignedShort2;
                                            Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                        } else {
                                            i3 = readUnsignedShort2;
                                        }
                                        if (this.b == 7) {
                                            if ("MakerNote".equals(c1123gl2.b)) {
                                                this.h = readInt2;
                                            } else if (i4 == 6 && "ThumbnailImage".equals(c1123gl2.b)) {
                                                this.i = readInt2;
                                                this.j = readInt;
                                                C1057fl c = C1057fl.c(6, this.e);
                                                j3 = j6;
                                                C1057fl a = C1057fl.a(this.i, this.e);
                                                c1123gl = c1123gl2;
                                                C1057fl a2 = C1057fl.a(this.j, this.e);
                                                hashMapArr2[4].put("Compression", c);
                                                hashMapArr2[4].put("JPEGInterchangeFormat", a);
                                                hashMapArr2[4].put("JPEGInterchangeFormatLength", a2);
                                                c1254il.c(readInt2);
                                            }
                                        }
                                        c1123gl = c1123gl2;
                                        j3 = j6;
                                        c1254il.c(readInt2);
                                    } else {
                                        j3 = j6;
                                        i3 = readUnsignedShort2;
                                        c1123gl = c1123gl2;
                                    }
                                    Integer num = (Integer) K.get(Integer.valueOf(i3));
                                    if (z2) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                                    }
                                    if (num != null) {
                                        if (readUnsignedShort3 != 3) {
                                            if (readUnsignedShort3 == 4) {
                                                j4 = c1254il.readInt() & 4294967295L;
                                            } else if (readUnsignedShort3 == 8) {
                                                readUnsignedShort = c1254il.readShort();
                                            } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                                readUnsignedShort = c1254il.readInt();
                                            } else {
                                                j4 = -1;
                                            }
                                            if (z2) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j4), c1123gl.b));
                                            }
                                            if (j4 > 0 || (i6 != -1 && j4 >= i6)) {
                                                hashSet2 = hashSet;
                                                if (z2) {
                                                    String i8 = AbstractC1888sN.i("Skip jump into the IFD since its offset is invalid: ", j4);
                                                    if (i6 != -1) {
                                                        i8 = i8 + " (total length: " + i6 + ")";
                                                    }
                                                    Log.d("ExifInterface", i8);
                                                }
                                            } else {
                                                hashSet2 = hashSet;
                                                if (!hashSet2.contains(Integer.valueOf((int) j4))) {
                                                    c1254il.c(j4);
                                                    s(c1254il, num.intValue());
                                                } else if (z2) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j4 + ")");
                                                }
                                            }
                                            c1254il.c(j3);
                                        } else {
                                            readUnsignedShort = c1254il.readUnsignedShort();
                                        }
                                        j4 = readUnsignedShort;
                                        if (z2) {
                                        }
                                        if (j4 > 0) {
                                        }
                                        hashSet2 = hashSet;
                                        if (z2) {
                                        }
                                        c1254il.c(j3);
                                    } else {
                                        hashSet2 = hashSet;
                                        long j7 = j3;
                                        int i9 = c1254il.i + this.g;
                                        byte[] bArr = new byte[(int) j2];
                                        c1254il.readFully(bArr);
                                        C1057fl c1057fl = new C1057fl(i9, bArr, readUnsignedShort3, readInt);
                                        HashMap hashMap = hashMapArr2[i];
                                        String str = c1123gl.b;
                                        hashMap.put(str, c1057fl);
                                        if ("DNGVersion".equals(str)) {
                                            this.b = 3;
                                        }
                                        if ((("Make".equals(str) || "Model".equals(str)) && c1057fl.f(this.e).contains("PENTAX")) || ("Compression".equals(str) && c1057fl.e(this.e) == 65535)) {
                                            this.b = 8;
                                        }
                                        if (c1254il.i != j7) {
                                            c1254il.c(j7);
                                        }
                                    }
                                }
                                s3 = (short) (s2 + 1);
                                i4 = i;
                                hashSet3 = hashSet2;
                                readShort = s4;
                                z4 = z2;
                            } else {
                                z3 = true;
                                if (z3) {
                                }
                                s3 = (short) (s2 + 1);
                                i4 = i;
                                hashSet3 = hashSet2;
                                readShort = s4;
                                z4 = z2;
                            }
                        } else if (z2) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + B[readUnsignedShort3] + ") is unexpected for tag: " + c1123gl2.b);
                        }
                    }
                }
                j = j5;
                if (z2) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
                j2 = 0;
                z3 = false;
                if (z3) {
                }
                s3 = (short) (s2 + 1);
                i4 = i;
                hashSet3 = hashSet2;
                readShort = s4;
                z4 = z2;
            } else if (z2) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
            }
            j = j5;
            j2 = 0;
            z3 = false;
            if (z3) {
            }
            s3 = (short) (s2 + 1);
            i4 = i;
            hashSet3 = hashSet2;
            readShort = s4;
            z4 = z2;
        }
        HashSet hashSet4 = hashSet3;
        boolean z5 = z4;
        int readInt3 = c1254il.readInt();
        if (z5) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j8 = readInt3;
        if (j8 <= 0) {
            if (z5) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        if (hashSet4.contains(Integer.valueOf(readInt3))) {
            if (z5) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        c1254il.c(j8);
        if (hashMapArr[4].isEmpty()) {
            s(c1254il, 4);
        } else if (hashMapArr[5].isEmpty()) {
            s(c1254il, 5);
        }
    }

    public final void t(int i, String str, String str2) {
        HashMap[] hashMapArr = this.c;
        if (hashMapArr[i].isEmpty() || hashMapArr[i].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMap.put(str2, (C1057fl) hashMap.get(str));
        hashMapArr[i].remove(str);
    }

    public final void u(C0991el c0991el) {
        C1057fl c1057fl;
        int e;
        HashMap hashMap = this.c[4];
        C1057fl c1057fl2 = (C1057fl) hashMap.get("Compression");
        if (c1057fl2 == null) {
            m(c0991el, hashMap);
            return;
        }
        int e2 = c1057fl2.e(this.e);
        if (e2 != 1) {
            if (e2 == 6) {
                m(c0991el, hashMap);
                return;
            } else if (e2 != 7) {
                return;
            }
        }
        C1057fl c1057fl3 = (C1057fl) hashMap.get("BitsPerSample");
        if (c1057fl3 != null) {
            int[] iArr = (int[]) c1057fl3.g(this.e);
            int[] iArr2 = m;
            if (Arrays.equals(iArr2, iArr) || (this.b == 3 && (c1057fl = (C1057fl) hashMap.get("PhotometricInterpretation")) != null && (((e = c1057fl.e(this.e)) == 1 && Arrays.equals(iArr, n)) || (e == 6 && Arrays.equals(iArr, iArr2))))) {
                C1057fl c1057fl4 = (C1057fl) hashMap.get("StripOffsets");
                C1057fl c1057fl5 = (C1057fl) hashMap.get("StripByteCounts");
                if (c1057fl4 == null || c1057fl5 == null) {
                    return;
                }
                long[] s2 = AbstractC1473m3.s(c1057fl4.g(this.e));
                long[] s3 = AbstractC1473m3.s(c1057fl5.g(this.e));
                if (s2 == null || s2.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (s3 == null || s3.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (s2.length != s3.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : s3) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < s2.length; i3++) {
                    int i4 = (int) s2[i3];
                    int i5 = (int) s3[i3];
                    if (i3 < s2.length - 1 && i4 + i5 != s2[i3 + 1]) {
                        this.f = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        c0991el.b(i6);
                        int i7 = i + i6;
                        byte[] bArr2 = new byte[i5];
                        try {
                            c0991el.readFully(bArr2);
                            i = i7 + i5;
                            System.arraycopy(bArr2, 0, bArr, i2, i5);
                            i2 += i5;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                }
                if (this.f) {
                    long j3 = s2[0];
                    return;
                }
                return;
            }
        }
        if (l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i, int i2) {
        HashMap[] hashMapArr = this.c;
        boolean isEmpty = hashMapArr[i].isEmpty();
        boolean z2 = l;
        if (isEmpty || hashMapArr[i2].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C1057fl c1057fl = (C1057fl) hashMapArr[i].get("ImageLength");
        C1057fl c1057fl2 = (C1057fl) hashMapArr[i].get("ImageWidth");
        C1057fl c1057fl3 = (C1057fl) hashMapArr[i2].get("ImageLength");
        C1057fl c1057fl4 = (C1057fl) hashMapArr[i2].get("ImageWidth");
        if (c1057fl == null || c1057fl2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c1057fl3 == null || c1057fl4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int e = c1057fl.e(this.e);
        int e2 = c1057fl2.e(this.e);
        int e3 = c1057fl3.e(this.e);
        int e4 = c1057fl4.e(this.e);
        if (e >= e3 || e2 >= e4) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    public final void w(C1254il c1254il, int i) {
        C1057fl c;
        C1057fl c2;
        HashMap[] hashMapArr = this.c;
        C1057fl c1057fl = (C1057fl) hashMapArr[i].get("DefaultCropSize");
        C1057fl c1057fl2 = (C1057fl) hashMapArr[i].get("SensorTopBorder");
        C1057fl c1057fl3 = (C1057fl) hashMapArr[i].get("SensorLeftBorder");
        C1057fl c1057fl4 = (C1057fl) hashMapArr[i].get("SensorBottomBorder");
        C1057fl c1057fl5 = (C1057fl) hashMapArr[i].get("SensorRightBorder");
        if (c1057fl != null) {
            if (c1057fl.a == 5) {
                C1189hl[] c1189hlArr = (C1189hl[]) c1057fl.g(this.e);
                if (c1189hlArr == null || c1189hlArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c1189hlArr));
                    return;
                }
                c = C1057fl.b(c1189hlArr[0], this.e);
                c2 = C1057fl.b(c1189hlArr[1], this.e);
            } else {
                int[] iArr = (int[]) c1057fl.g(this.e);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c = C1057fl.c(iArr[0], this.e);
                c2 = C1057fl.c(iArr[1], this.e);
            }
            hashMapArr[i].put("ImageWidth", c);
            hashMapArr[i].put("ImageLength", c2);
            return;
        }
        if (c1057fl2 != null && c1057fl3 != null && c1057fl4 != null && c1057fl5 != null) {
            int e = c1057fl2.e(this.e);
            int e2 = c1057fl4.e(this.e);
            int e3 = c1057fl5.e(this.e);
            int e4 = c1057fl3.e(this.e);
            if (e2 <= e || e3 <= e4) {
                return;
            }
            C1057fl c3 = C1057fl.c(e2 - e, this.e);
            C1057fl c4 = C1057fl.c(e3 - e4, this.e);
            hashMapArr[i].put("ImageLength", c3);
            hashMapArr[i].put("ImageWidth", c4);
            return;
        }
        C1057fl c1057fl6 = (C1057fl) hashMapArr[i].get("ImageLength");
        C1057fl c1057fl7 = (C1057fl) hashMapArr[i].get("ImageWidth");
        if (c1057fl6 == null || c1057fl7 == null) {
            C1057fl c1057fl8 = (C1057fl) hashMapArr[i].get("JPEGInterchangeFormat");
            C1057fl c1057fl9 = (C1057fl) hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (c1057fl8 == null || c1057fl9 == null) {
                return;
            }
            int e5 = c1057fl8.e(this.e);
            int e6 = c1057fl8.e(this.e);
            c1254il.c(e5);
            byte[] bArr = new byte[e6];
            c1254il.readFully(bArr);
            e(new C0991el(bArr), e5, i);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.c;
        C1057fl c1057fl = (C1057fl) hashMapArr[1].get("PixelXDimension");
        C1057fl c1057fl2 = (C1057fl) hashMapArr[1].get("PixelYDimension");
        if (c1057fl != null && c1057fl2 != null) {
            hashMapArr[0].put("ImageWidth", c1057fl);
            hashMapArr[0].put("ImageLength", c1057fl2);
        }
        if (hashMapArr[4].isEmpty() && n(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!n(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
