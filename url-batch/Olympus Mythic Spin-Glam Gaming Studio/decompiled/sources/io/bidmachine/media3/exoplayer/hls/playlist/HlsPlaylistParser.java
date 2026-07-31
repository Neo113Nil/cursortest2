package io.bidmachine.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.safedk.android.analytics.brandsafety.m;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.UriUtil;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.hls.HlsTrackMetadataEntry;
import io.bidmachine.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import io.bidmachine.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist;
import io.bidmachine.media3.exoplayer.upstream.ParsingLoadable;
import io.bidmachine.media3.extractor.mp4.PsshAtomUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UnstableApi
/* loaded from: classes13.dex */
public final class HlsPlaylistParser implements ParsingLoadable.Parser<HlsPlaylist> {
    private static final String ATTR_CLOSED_CAPTIONS_NONE = "CLOSED-CAPTIONS=NONE";
    private static final String BOOLEAN_FALSE = "NO";
    private static final String BOOLEAN_TRUE = "YES";
    private static final String DATERANGE_CLASS_INTERSTITIALS = "com.apple.hls.interstitial";
    private static final String KEYFORMAT_IDENTITY = "identity";
    private static final String KEYFORMAT_PLAYREADY = "com.microsoft.playready";
    private static final String KEYFORMAT_WIDEVINE_PSSH_BINARY = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    private static final String KEYFORMAT_WIDEVINE_PSSH_JSON = "com.widevine";
    private static final String LOG_TAG = "HlsPlaylistParser";
    private static final String METHOD_AES_128 = "AES-128";
    private static final String METHOD_NONE = "NONE";
    private static final String METHOD_SAMPLE_AES = "SAMPLE-AES";
    private static final String METHOD_SAMPLE_AES_CENC = "SAMPLE-AES-CENC";
    private static final String METHOD_SAMPLE_AES_CTR = "SAMPLE-AES-CTR";
    private static final String PLAYLIST_HEADER = "#EXTM3U";
    private static final String TAG_BYTERANGE = "#EXT-X-BYTERANGE";
    private static final String TAG_DATERANGE = "#EXT-X-DATERANGE";
    private static final String TAG_DEFINE = "#EXT-X-DEFINE";
    private static final String TAG_DISCONTINUITY = "#EXT-X-DISCONTINUITY";
    private static final String TAG_DISCONTINUITY_SEQUENCE = "#EXT-X-DISCONTINUITY-SEQUENCE";
    private static final String TAG_ENDLIST = "#EXT-X-ENDLIST";
    private static final String TAG_GAP = "#EXT-X-GAP";
    private static final String TAG_IFRAME = "#EXT-X-I-FRAMES-ONLY";
    private static final String TAG_INDEPENDENT_SEGMENTS = "#EXT-X-INDEPENDENT-SEGMENTS";
    private static final String TAG_INIT_SEGMENT = "#EXT-X-MAP";
    private static final String TAG_I_FRAME_STREAM_INF = "#EXT-X-I-FRAME-STREAM-INF";
    private static final String TAG_KEY = "#EXT-X-KEY";
    private static final String TAG_MEDIA = "#EXT-X-MEDIA";
    private static final String TAG_MEDIA_DURATION = "#EXTINF";
    private static final String TAG_MEDIA_SEQUENCE = "#EXT-X-MEDIA-SEQUENCE";
    private static final String TAG_PART = "#EXT-X-PART";
    private static final String TAG_PART_INF = "#EXT-X-PART-INF";
    private static final String TAG_PLAYLIST_TYPE = "#EXT-X-PLAYLIST-TYPE";
    private static final String TAG_PREFIX = "#EXT";
    private static final String TAG_PRELOAD_HINT = "#EXT-X-PRELOAD-HINT";
    private static final String TAG_PROGRAM_DATE_TIME = "#EXT-X-PROGRAM-DATE-TIME";
    private static final String TAG_RENDITION_REPORT = "#EXT-X-RENDITION-REPORT";
    private static final String TAG_SERVER_CONTROL = "#EXT-X-SERVER-CONTROL";
    private static final String TAG_SESSION_KEY = "#EXT-X-SESSION-KEY";
    private static final String TAG_SKIP = "#EXT-X-SKIP";
    private static final String TAG_START = "#EXT-X-START";
    private static final String TAG_STREAM_INF = "#EXT-X-STREAM-INF";
    private static final String TAG_TARGET_DURATION = "#EXT-X-TARGETDURATION";
    private static final String TAG_VERSION = "#EXT-X-VERSION";
    private static final String TYPE_AUDIO = "AUDIO";
    private static final String TYPE_CLOSED_CAPTIONS = "CLOSED-CAPTIONS";
    private static final String TYPE_MAP = "MAP";
    private static final String TYPE_PART = "PART";
    private static final String TYPE_SUBTITLES = "SUBTITLES";
    private static final String TYPE_VIDEO = "VIDEO";
    private final HlsMultivariantPlaylist multivariantPlaylist;

    @Nullable
    private final HlsMediaPlaylist previousMediaPlaylist;
    private static final Pattern REGEX_AVERAGE_BANDWIDTH = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_VIDEO = Pattern.compile("VIDEO=\"(.+?)\"");
    private static final Pattern REGEX_AUDIO = Pattern.compile("AUDIO=\"(.+?)\"");
    private static final Pattern REGEX_SUBTITLES = Pattern.compile("SUBTITLES=\"(.+?)\"");
    private static final Pattern REGEX_CLOSED_CAPTIONS = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    private static final Pattern REGEX_BANDWIDTH = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_CHANNELS = Pattern.compile("CHANNELS=\"(.+?)\"");
    private static final Pattern REGEX_VIDEO_RANGE = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    private static final Pattern REGEX_CODECS = Pattern.compile("CODECS=\"(.+?)\"");
    private static final Pattern REGEX_SUPPLEMENTAL_CODECS = Pattern.compile("SUPPLEMENTAL-CODECS=\"(.+?)\"");
    private static final Pattern REGEX_RESOLUTION = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern REGEX_FRAME_RATE = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern REGEX_TARGET_DURATION = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern REGEX_ATTR_DURATION = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_ATTR_DURATION_PREFIXED = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_TARGET_DURATION = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    private static final Pattern REGEX_VERSION = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern REGEX_PLAYLIST_TYPE = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern REGEX_CAN_SKIP_UNTIL = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CAN_SKIP_DATE_RANGES = compileBooleanAttrPattern("CAN-SKIP-DATERANGES");
    private static final Pattern REGEX_SKIPPED_SEGMENTS = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    private static final Pattern REGEX_HOLD_BACK = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_HOLD_BACK = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CAN_BLOCK_RELOAD = compileBooleanAttrPattern("CAN-BLOCK-RELOAD");
    private static final Pattern REGEX_MEDIA_SEQUENCE = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern REGEX_MEDIA_DURATION = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern REGEX_MEDIA_TITLE = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern REGEX_LAST_MSN = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern REGEX_LAST_PART = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern REGEX_TIME_OFFSET = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern REGEX_BYTERANGE = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern REGEX_ATTR_BYTERANGE = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern REGEX_BYTERANGE_START = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern REGEX_BYTERANGE_LENGTH = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern REGEX_METHOD = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern REGEX_KEYFORMAT = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern REGEX_KEYFORMATVERSIONS = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern REGEX_URI = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern REGEX_IV = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern REGEX_TYPE = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern REGEX_PRELOAD_HINT_TYPE = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern REGEX_LANGUAGE = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern REGEX_NAME = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern REGEX_GROUP_ID = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern REGEX_CHARACTERISTICS = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern REGEX_INSTREAM_ID = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern REGEX_AUTOSELECT = compileBooleanAttrPattern("AUTOSELECT");
    private static final Pattern REGEX_DEFAULT = compileBooleanAttrPattern("DEFAULT");
    private static final Pattern REGEX_FORCED = compileBooleanAttrPattern("FORCED");
    private static final Pattern REGEX_INDEPENDENT = compileBooleanAttrPattern("INDEPENDENT");
    private static final Pattern REGEX_GAP = compileBooleanAttrPattern("GAP");
    private static final Pattern REGEX_PRECISE = compileBooleanAttrPattern("PRECISE");
    private static final Pattern REGEX_VALUE = Pattern.compile("VALUE=\"(.+?)\"");
    private static final Pattern REGEX_IMPORT = Pattern.compile("IMPORT=\"(.+?)\"");
    private static final Pattern REGEX_ID = Pattern.compile("[:,]ID=\"(.+?)\"");
    private static final Pattern REGEX_CLASS = Pattern.compile("CLASS=\"(.+?)\"");
    private static final Pattern REGEX_START_DATE = Pattern.compile("START-DATE=\"(.+?)\"");
    private static final Pattern REGEX_CUE = Pattern.compile("CUE=\"(.+?)\"");
    private static final Pattern REGEX_END_DATE = Pattern.compile("END-DATE=\"(.+?)\"");
    private static final Pattern REGEX_PLANNED_DURATION = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_END_ON_NEXT = compileBooleanAttrPattern("END-ON-NEXT");
    private static final Pattern REGEX_ASSET_URI = Pattern.compile("X-ASSET-URI=\"(.+?)\"");
    private static final Pattern REGEX_ASSET_LIST_URI = Pattern.compile("X-ASSET-LIST=\"(.+?)\"");
    private static final Pattern REGEX_RESUME_OFFSET = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern REGEX_PLAYOUT_LIMIT = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    private static final Pattern REGEX_SNAP = Pattern.compile("X-SNAP=\"(.+?)\"");
    private static final Pattern REGEX_RESTRICT = Pattern.compile("X-RESTRICT=\"(.+?)\"");
    private static final Pattern REGEX_VARIABLE_REFERENCE = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    private static final Pattern REGEX_CLIENT_DEFINED_ATTRIBUTE_PREFIX = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public static final class DeltaUpdateException extends IOException {
    }

    public HlsPlaylistParser() {
        this(HlsMultivariantPlaylist.EMPTY, null);
    }

    public HlsPlaylistParser(HlsMultivariantPlaylist hlsMultivariantPlaylist, @Nullable HlsMediaPlaylist hlsMediaPlaylist) {
        this.multivariantPlaylist = hlsMultivariantPlaylist;
        this.previousMediaPlaylist = hlsMediaPlaylist;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.media3.exoplayer.upstream.ParsingLoadable.Parser
    public HlsPlaylist parse(Uri uri, InputStream inputStream) throws IOException {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!checkPlaylistHeader(bufferedReader)) {
                throw ParserException.createForMalformedManifest("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    trim = readLine.trim();
                    if (!trim.isEmpty()) {
                        if (trim.startsWith(TAG_STREAM_INF)) {
                            arrayDeque.add(trim);
                            return parseMultivariantPlaylist(new LineIterator(arrayDeque, bufferedReader), uri.toString());
                        }
                        if (trim.startsWith(TAG_TARGET_DURATION) || trim.startsWith(TAG_MEDIA_SEQUENCE) || trim.startsWith(TAG_MEDIA_DURATION) || trim.startsWith(TAG_KEY) || trim.startsWith(TAG_BYTERANGE) || trim.equals(TAG_DISCONTINUITY) || trim.equals(TAG_DISCONTINUITY_SEQUENCE) || trim.equals(TAG_ENDLIST)) {
                            break;
                        }
                        arrayDeque.add(trim);
                    }
                } else {
                    Util.closeQuietly(bufferedReader);
                    throw ParserException.createForMalformedManifest("Failed to parse the playlist, could not identify any tags.", null);
                }
            }
            arrayDeque.add(trim);
            return parseMediaPlaylist(this.multivariantPlaylist, this.previousMediaPlaylist, new LineIterator(arrayDeque, bufferedReader), uri.toString());
        } finally {
            Util.closeQuietly(bufferedReader);
        }
    }

    private static boolean checkPlaylistHeader(BufferedReader bufferedReader) throws IOException {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int skipIgnorableWhitespace = skipIgnorableWhitespace(bufferedReader, true, read);
        for (int i = 0; i < 7; i++) {
            if (skipIgnorableWhitespace != PLAYLIST_HEADER.charAt(i)) {
                return false;
            }
            skipIgnorableWhitespace = bufferedReader.read();
        }
        return Util.isLinebreak(skipIgnorableWhitespace(bufferedReader, false, skipIgnorableWhitespace));
    }

    private static int skipIgnorableWhitespace(BufferedReader bufferedReader, boolean z, int i) throws IOException {
        while (i != -1 && Character.isWhitespace(i) && (z || !Util.isLinebreak(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    private static boolean isDolbyVisionFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        if (!MimeTypes.isDolbyVisionCodec(str2, str3)) {
            return false;
        }
        if (str3 == null) {
            return true;
        }
        if (str == null || str4 == null) {
            return false;
        }
        return (!str.equals("PQ") || str4.equals("db1p")) && (!str.equals("SDR") || str4.equals("db2g")) && (!str.equals("HLG") || str4.startsWith("db4"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x018e, code lost:
    
        if (r3 > 0) goto L55;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:99:0x0397. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019f  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static HlsMultivariantPlaylist parseMultivariantPlaylist(LineIterator lineIterator, String str) throws IOException {
        char c;
        Format format;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        ArrayList arrayList3;
        int parseInt;
        String str3;
        Format format2;
        int i;
        String str4;
        int i2;
        ArrayList arrayList4;
        int i3;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        HashMap hashMap;
        String str5;
        String str6;
        String codecsOfType;
        String parseOptionalStringAttr;
        int i4;
        int i5;
        Uri resolveToUri;
        HashMap hashMap2;
        ArrayList arrayList11;
        String str7 = str;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        ArrayList arrayList19 = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            String str8 = "application/x-mpegURL";
            if (lineIterator.hasNext()) {
                String next = lineIterator.next();
                if (next.startsWith(TAG_PREFIX)) {
                    arrayList19.add(next);
                }
                boolean startsWith = next.startsWith(TAG_I_FRAME_STREAM_INF);
                if (next.startsWith(TAG_DEFINE)) {
                    hashMap4.put(parseStringAttr(next, REGEX_NAME, hashMap4), parseStringAttr(next, REGEX_VALUE, hashMap4));
                } else {
                    if (next.equals(TAG_INDEPENDENT_SEGMENTS)) {
                        hashMap2 = hashMap3;
                        arrayList9 = arrayList13;
                        arrayList8 = arrayList14;
                        arrayList7 = arrayList15;
                        arrayList5 = arrayList16;
                        arrayList10 = arrayList17;
                        arrayList4 = arrayList18;
                        arrayList6 = arrayList19;
                        z = true;
                    } else if (next.startsWith(TAG_MEDIA)) {
                        arrayList17.add(next);
                    } else if (next.startsWith(TAG_SESSION_KEY)) {
                        DrmInitData.SchemeData parseDrmSchemeData = parseDrmSchemeData(next, parseOptionalStringAttr(next, REGEX_KEYFORMAT, KEYFORMAT_IDENTITY, hashMap4), hashMap4);
                        if (parseDrmSchemeData != null) {
                            arrayList18.add(new DrmInitData(parseEncryptionScheme(parseStringAttr(next, REGEX_METHOD, hashMap4)), parseDrmSchemeData));
                        }
                    } else if (next.startsWith(TAG_STREAM_INF) || startsWith) {
                        z2 |= next.contains(ATTR_CLOSED_CAPTIONS_NONE);
                        if (startsWith) {
                            i3 = 16384;
                            arrayList4 = arrayList18;
                        } else {
                            arrayList4 = arrayList18;
                            i3 = 0;
                        }
                        int parseIntAttr = parseIntAttr(next, REGEX_BANDWIDTH);
                        arrayList5 = arrayList16;
                        arrayList6 = arrayList19;
                        int parseOptionalIntAttr = parseOptionalIntAttr(next, REGEX_AVERAGE_BANDWIDTH, -1);
                        String parseOptionalStringAttr2 = parseOptionalStringAttr(next, REGEX_VIDEO_RANGE, hashMap4);
                        arrayList7 = arrayList15;
                        String parseOptionalStringAttr3 = parseOptionalStringAttr(next, REGEX_CODECS, hashMap4);
                        arrayList8 = arrayList14;
                        String parseOptionalStringAttr4 = parseOptionalStringAttr(next, REGEX_SUPPLEMENTAL_CODECS, hashMap4);
                        arrayList9 = arrayList13;
                        if (parseOptionalStringAttr4 != null) {
                            String[] split = Util.split(Util.splitAtFirst(parseOptionalStringAttr4, StringUtils.COMMA)[0], "/");
                            String str9 = split[0];
                            arrayList10 = arrayList17;
                            if (split.length > 1) {
                                str6 = split[1];
                                hashMap = hashMap3;
                                str5 = str9;
                                codecsOfType = Util.getCodecsOfType(parseOptionalStringAttr3, 2);
                                if (isDolbyVisionFormat(parseOptionalStringAttr2, codecsOfType, str5, str6)) {
                                    if (str5 == null) {
                                        str5 = codecsOfType;
                                    }
                                    String codecsWithoutType = Util.getCodecsWithoutType(parseOptionalStringAttr3, 2);
                                    if (codecsWithoutType != null) {
                                        str5 = str5 + StringUtils.COMMA + codecsWithoutType;
                                    }
                                    parseOptionalStringAttr3 = str5;
                                }
                                parseOptionalStringAttr = parseOptionalStringAttr(next, REGEX_RESOLUTION, hashMap4);
                                if (parseOptionalStringAttr != null) {
                                    String[] split2 = Util.split(parseOptionalStringAttr, VastAttributes.HORIZONTAL_POSITION);
                                    i5 = Integer.parseInt(split2[0]);
                                    i4 = Integer.parseInt(split2[1]);
                                    if (i5 > 0) {
                                    }
                                }
                                i4 = -1;
                                i5 = -1;
                                String parseOptionalStringAttr5 = parseOptionalStringAttr(next, REGEX_FRAME_RATE, hashMap4);
                                float parseFloat = parseOptionalStringAttr5 == null ? Float.parseFloat(parseOptionalStringAttr5) : -1.0f;
                                String parseOptionalStringAttr6 = parseOptionalStringAttr(next, REGEX_VIDEO, hashMap4);
                                String parseOptionalStringAttr7 = parseOptionalStringAttr(next, REGEX_AUDIO, hashMap4);
                                String parseOptionalStringAttr8 = parseOptionalStringAttr(next, REGEX_SUBTITLES, hashMap4);
                                String parseOptionalStringAttr9 = parseOptionalStringAttr(next, REGEX_CLOSED_CAPTIONS, hashMap4);
                                if (!startsWith) {
                                    resolveToUri = UriUtil.resolveToUri(str7, parseStringAttr(next, REGEX_URI, hashMap4));
                                } else {
                                    if (!lineIterator.hasNext()) {
                                        throw ParserException.createForMalformedManifest("#EXT-X-STREAM-INF must be followed by another line", null);
                                    }
                                    resolveToUri = UriUtil.resolveToUri(str7, replaceVariableReferences(lineIterator.next(), hashMap4));
                                }
                                arrayList12.add(new HlsMultivariantPlaylist.Variant(resolveToUri, new Format.Builder().setId(arrayList12.size()).setContainerMimeType("application/x-mpegURL").setCodecs(parseOptionalStringAttr3).setAverageBitrate(parseOptionalIntAttr).setPeakBitrate(parseIntAttr).setWidth(i5).setHeight(i4).setFrameRate(parseFloat).setRoleFlags(i3).build(), parseOptionalStringAttr6, parseOptionalStringAttr7, parseOptionalStringAttr8, parseOptionalStringAttr9));
                                hashMap2 = hashMap;
                                arrayList11 = (ArrayList) hashMap2.get(resolveToUri);
                                if (arrayList11 == null) {
                                    arrayList11 = new ArrayList();
                                    hashMap2.put(resolveToUri, arrayList11);
                                }
                                arrayList11.add(new HlsTrackMetadataEntry.VariantInfo(parseOptionalIntAttr, parseIntAttr, parseOptionalStringAttr6, parseOptionalStringAttr7, parseOptionalStringAttr8, parseOptionalStringAttr9));
                            } else {
                                hashMap = hashMap3;
                                str5 = str9;
                            }
                        } else {
                            arrayList10 = arrayList17;
                            hashMap = hashMap3;
                            str5 = null;
                        }
                        str6 = null;
                        codecsOfType = Util.getCodecsOfType(parseOptionalStringAttr3, 2);
                        if (isDolbyVisionFormat(parseOptionalStringAttr2, codecsOfType, str5, str6)) {
                        }
                        parseOptionalStringAttr = parseOptionalStringAttr(next, REGEX_RESOLUTION, hashMap4);
                        if (parseOptionalStringAttr != null) {
                        }
                        i4 = -1;
                        i5 = -1;
                        String parseOptionalStringAttr52 = parseOptionalStringAttr(next, REGEX_FRAME_RATE, hashMap4);
                        if (parseOptionalStringAttr52 == null) {
                        }
                        String parseOptionalStringAttr62 = parseOptionalStringAttr(next, REGEX_VIDEO, hashMap4);
                        String parseOptionalStringAttr72 = parseOptionalStringAttr(next, REGEX_AUDIO, hashMap4);
                        String parseOptionalStringAttr82 = parseOptionalStringAttr(next, REGEX_SUBTITLES, hashMap4);
                        String parseOptionalStringAttr92 = parseOptionalStringAttr(next, REGEX_CLOSED_CAPTIONS, hashMap4);
                        if (!startsWith) {
                        }
                        arrayList12.add(new HlsMultivariantPlaylist.Variant(resolveToUri, new Format.Builder().setId(arrayList12.size()).setContainerMimeType("application/x-mpegURL").setCodecs(parseOptionalStringAttr3).setAverageBitrate(parseOptionalIntAttr).setPeakBitrate(parseIntAttr).setWidth(i5).setHeight(i4).setFrameRate(parseFloat).setRoleFlags(i3).build(), parseOptionalStringAttr62, parseOptionalStringAttr72, parseOptionalStringAttr82, parseOptionalStringAttr92));
                        hashMap2 = hashMap;
                        arrayList11 = (ArrayList) hashMap2.get(resolveToUri);
                        if (arrayList11 == null) {
                        }
                        arrayList11.add(new HlsTrackMetadataEntry.VariantInfo(parseOptionalIntAttr, parseIntAttr, parseOptionalStringAttr62, parseOptionalStringAttr72, parseOptionalStringAttr82, parseOptionalStringAttr92));
                    }
                    hashMap3 = hashMap2;
                    arrayList18 = arrayList4;
                    arrayList16 = arrayList5;
                    arrayList19 = arrayList6;
                    arrayList15 = arrayList7;
                    arrayList14 = arrayList8;
                    arrayList13 = arrayList9;
                    arrayList17 = arrayList10;
                    str7 = str;
                }
                hashMap2 = hashMap3;
                arrayList9 = arrayList13;
                arrayList8 = arrayList14;
                arrayList7 = arrayList15;
                arrayList5 = arrayList16;
                arrayList10 = arrayList17;
                arrayList4 = arrayList18;
                arrayList6 = arrayList19;
                hashMap3 = hashMap2;
                arrayList18 = arrayList4;
                arrayList16 = arrayList5;
                arrayList19 = arrayList6;
                arrayList15 = arrayList7;
                arrayList14 = arrayList8;
                arrayList13 = arrayList9;
                arrayList17 = arrayList10;
                str7 = str;
            } else {
                HashMap hashMap5 = hashMap3;
                ArrayList arrayList20 = arrayList13;
                ArrayList arrayList21 = arrayList14;
                ArrayList arrayList22 = arrayList15;
                ArrayList arrayList23 = arrayList16;
                ArrayList arrayList24 = arrayList17;
                ArrayList arrayList25 = arrayList18;
                ArrayList arrayList26 = arrayList19;
                ArrayList arrayList27 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i6 = 0;
                while (i6 < arrayList12.size()) {
                    HlsMultivariantPlaylist.Variant variant = (HlsMultivariantPlaylist.Variant) arrayList12.get(i6);
                    if (hashSet.add(variant.url)) {
                        Assertions.checkState(variant.format.metadata == null);
                        i2 = 1;
                        arrayList27.add(variant.copyWithFormat(variant.format.buildUpon().setMetadata(new Metadata(new HlsTrackMetadataEntry(null, null, (List) Assertions.checkNotNull((ArrayList) hashMap5.get(variant.url))))).build()));
                    } else {
                        i2 = 1;
                    }
                    i6 += i2;
                }
                Uri uri = null;
                ArrayList arrayList28 = null;
                Format format3 = null;
                int i7 = 0;
                while (i7 < arrayList24.size()) {
                    ArrayList arrayList29 = arrayList24;
                    String str10 = (String) arrayList29.get(i7);
                    String parseStringAttr = parseStringAttr(str10, REGEX_GROUP_ID, hashMap4);
                    String parseStringAttr2 = parseStringAttr(str10, REGEX_NAME, hashMap4);
                    Format.Builder language = new Format.Builder().setId(parseStringAttr + ":" + parseStringAttr2).setLabel(parseStringAttr2).setContainerMimeType(str8).setSelectionFlags(parseSelectionFlags(str10)).setRoleFlags(parseRoleFlags(str10, hashMap4)).setLanguage(parseOptionalStringAttr(str10, REGEX_LANGUAGE, hashMap4));
                    String parseOptionalStringAttr10 = parseOptionalStringAttr(str10, REGEX_URI, hashMap4);
                    Uri resolveToUri2 = parseOptionalStringAttr10 == null ? uri : UriUtil.resolveToUri(str, parseOptionalStringAttr10);
                    String str11 = str8;
                    arrayList24 = arrayList29;
                    Metadata metadata = new Metadata(new HlsTrackMetadataEntry(parseStringAttr, parseStringAttr2, Collections.emptyList()));
                    String parseStringAttr3 = parseStringAttr(str10, REGEX_TYPE, hashMap4);
                    parseStringAttr3.hashCode();
                    switch (parseStringAttr3.hashCode()) {
                        case -959297733:
                            if (parseStringAttr3.equals(TYPE_SUBTITLES)) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -333210994:
                            if (parseStringAttr3.equals(TYPE_CLOSED_CAPTIONS)) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 62628790:
                            if (parseStringAttr3.equals(TYPE_AUDIO)) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 81665115:
                            if (parseStringAttr3.equals("VIDEO")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            format = format3;
                            arrayList = arrayList21;
                            arrayList2 = arrayList20;
                            HlsMultivariantPlaylist.Variant variantWithSubtitleGroup = getVariantWithSubtitleGroup(arrayList12, parseStringAttr);
                            if (variantWithSubtitleGroup != null) {
                                String codecsOfType2 = Util.getCodecsOfType(variantWithSubtitleGroup.format.codecs, 3);
                                language.setCodecs(codecsOfType2);
                                str2 = MimeTypes.getMediaMimeType(codecsOfType2);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            language.setSampleMimeType(str2).setMetadata(metadata);
                            if (resolveToUri2 != null) {
                                HlsMultivariantPlaylist.Rendition rendition = new HlsMultivariantPlaylist.Rendition(resolveToUri2, language.build(), parseStringAttr, parseStringAttr2);
                                arrayList3 = arrayList22;
                                arrayList3.add(rendition);
                            } else {
                                arrayList3 = arrayList22;
                                Log.w(LOG_TAG, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            format2 = format;
                            i = 1;
                            break;
                        case 1:
                            Format format4 = format3;
                            arrayList = arrayList21;
                            arrayList2 = arrayList20;
                            String parseStringAttr4 = parseStringAttr(str10, REGEX_INSTREAM_ID, hashMap4);
                            if (parseStringAttr4.startsWith("CC")) {
                                parseInt = Integer.parseInt(parseStringAttr4.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(parseStringAttr4.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (arrayList28 == null) {
                                arrayList28 = new ArrayList();
                            }
                            language.setSampleMimeType(str3).setAccessibilityChannel(parseInt);
                            arrayList28.add(language.build());
                            format2 = format4;
                            arrayList3 = arrayList22;
                            i = 1;
                            break;
                        case 2:
                            arrayList2 = arrayList20;
                            HlsMultivariantPlaylist.Variant variantWithAudioGroup = getVariantWithAudioGroup(arrayList12, parseStringAttr);
                            if (variantWithAudioGroup != null) {
                                format = format3;
                                String codecsOfType3 = Util.getCodecsOfType(variantWithAudioGroup.format.codecs, 1);
                                language.setCodecs(codecsOfType3);
                                str4 = MimeTypes.getMediaMimeType(codecsOfType3);
                            } else {
                                format = format3;
                                str4 = null;
                            }
                            String parseOptionalStringAttr11 = parseOptionalStringAttr(str10, REGEX_CHANNELS, hashMap4);
                            if (parseOptionalStringAttr11 != null) {
                                language.setChannelCount(Integer.parseInt(Util.splitAtFirst(parseOptionalStringAttr11, "/")[0]));
                                if ("audio/eac3".equals(str4) && parseOptionalStringAttr11.endsWith("/JOC")) {
                                    language.setCodecs("ec+3");
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            language.setSampleMimeType(str4);
                            if (resolveToUri2 == null) {
                                arrayList = arrayList21;
                                if (variantWithAudioGroup != null) {
                                    format2 = language.build();
                                    arrayList3 = arrayList22;
                                    i = 1;
                                    break;
                                }
                            } else {
                                language.setMetadata(metadata);
                                arrayList = arrayList21;
                                arrayList.add(new HlsMultivariantPlaylist.Rendition(resolveToUri2, language.build(), parseStringAttr, parseStringAttr2));
                            }
                            arrayList3 = arrayList22;
                            format2 = format;
                            i = 1;
                            break;
                        case 3:
                            HlsMultivariantPlaylist.Variant variantWithVideoGroup = getVariantWithVideoGroup(arrayList12, parseStringAttr);
                            if (variantWithVideoGroup != null) {
                                Format format5 = variantWithVideoGroup.format;
                                String codecsOfType4 = Util.getCodecsOfType(format5.codecs, 2);
                                language.setCodecs(codecsOfType4).setSampleMimeType(MimeTypes.getMediaMimeType(codecsOfType4)).setWidth(format5.width).setHeight(format5.height).setFrameRate(format5.frameRate);
                            }
                            if (resolveToUri2 != null) {
                                language.setMetadata(metadata);
                                arrayList2 = arrayList20;
                                arrayList2.add(new HlsMultivariantPlaylist.Rendition(resolveToUri2, language.build(), parseStringAttr, parseStringAttr2));
                                format = format3;
                                arrayList3 = arrayList22;
                                arrayList = arrayList21;
                                format2 = format;
                                i = 1;
                                break;
                            }
                        default:
                            format = format3;
                            arrayList3 = arrayList22;
                            arrayList = arrayList21;
                            arrayList2 = arrayList20;
                            format2 = format;
                            i = 1;
                            break;
                    }
                    i7 += i;
                    arrayList20 = arrayList2;
                    arrayList21 = arrayList;
                    arrayList22 = arrayList3;
                    uri = null;
                    format3 = format2;
                    str8 = str11;
                }
                return new HlsMultivariantPlaylist(str, arrayList26, arrayList27, arrayList20, arrayList21, arrayList22, arrayList23, format3, z2 ? Collections.emptyList() : arrayList28, z, hashMap4, arrayList25);
            }
        }
    }

    @Nullable
    private static HlsMultivariantPlaylist.Variant getVariantWithAudioGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.audioGroupId)) {
                return variant;
            }
        }
        return null;
    }

    @Nullable
    private static HlsMultivariantPlaylist.Variant getVariantWithVideoGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.videoGroupId)) {
                return variant;
            }
        }
        return null;
    }

    @Nullable
    private static HlsMultivariantPlaylist.Variant getVariantWithSubtitleGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.subtitleGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static HlsMediaPlaylist parseMediaPlaylist(HlsMultivariantPlaylist hlsMultivariantPlaylist, @Nullable HlsMediaPlaylist hlsMediaPlaylist, LineIterator lineIterator, String str) throws IOException {
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        String str2;
        long j;
        String str3;
        int i2;
        HlsMediaPlaylist.Part part;
        String parseOptionalStringAttr;
        String str4;
        long j2;
        long j3;
        ArrayList arrayList8;
        String str5;
        long j4;
        long j5;
        String str6;
        DrmInitData drmInitData;
        Matcher matcher;
        char c;
        ArrayList arrayList9;
        String[] strArr;
        char c2;
        long j6;
        HlsMultivariantPlaylist hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
        HlsMediaPlaylist hlsMediaPlaylist2 = hlsMediaPlaylist;
        boolean z = hlsMultivariantPlaylist2.hasIndependentSegments;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        HlsMediaPlaylist.ServerControl serverControl = new HlsMediaPlaylist.ServerControl(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        boolean z2 = false;
        String str7 = "";
        boolean z3 = z;
        HlsMediaPlaylist.ServerControl serverControl2 = serverControl;
        int i3 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i4 = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i5 = 0;
        boolean z8 = false;
        long j7 = -9223372036854775807L;
        long j8 = -9223372036854775807L;
        long j9 = -9223372036854775807L;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        String str8 = str7;
        int i6 = 1;
        DrmInitData drmInitData2 = null;
        DrmInitData drmInitData3 = null;
        String str9 = null;
        long j18 = -1;
        String str10 = null;
        String str11 = null;
        HlsMediaPlaylist.Segment segment = null;
        ArrayList arrayList15 = arrayList11;
        HlsMediaPlaylist.Part part2 = null;
        while (lineIterator.hasNext()) {
            String next = lineIterator.next();
            if (next.startsWith(TAG_PREFIX)) {
                arrayList13.add(next);
            }
            if (next.startsWith(TAG_PLAYLIST_TYPE)) {
                String parseStringAttr = parseStringAttr(next, REGEX_PLAYLIST_TYPE, hashMap);
                if ("VOD".equals(parseStringAttr)) {
                    i3 = 1;
                } else if ("EVENT".equals(parseStringAttr)) {
                    i3 = 2;
                }
            } else if (next.equals(TAG_IFRAME)) {
                z8 = true;
            } else {
                if (next.startsWith(TAG_START)) {
                    arrayList = arrayList10;
                    j7 = (long) (parseDoubleAttr(next, REGEX_TIME_OFFSET) * 1000000.0d);
                    z4 = parseOptionalBooleanAttribute(next, REGEX_PRECISE, z2);
                } else {
                    arrayList = arrayList10;
                    if (next.startsWith(TAG_SERVER_CONTROL)) {
                        serverControl2 = parseServerControl(next);
                    } else if (next.startsWith(TAG_PART_INF)) {
                        j9 = (long) (parseDoubleAttr(next, REGEX_PART_TARGET_DURATION) * 1000000.0d);
                    } else if (next.startsWith(TAG_INIT_SEGMENT)) {
                        String parseStringAttr2 = parseStringAttr(next, REGEX_URI, hashMap);
                        String parseOptionalStringAttr2 = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, hashMap);
                        if (parseOptionalStringAttr2 != null) {
                            String[] split = Util.split(parseOptionalStringAttr2, "@");
                            j18 = Long.parseLong(split[z2 ? 1 : 0]);
                            if (split.length > 1) {
                                j12 = Long.parseLong(split[1]);
                            }
                        }
                        if (j18 == -1) {
                            j12 = 0;
                        }
                        String str12 = str9;
                        String str13 = str10;
                        if (str12 != null && str13 == null) {
                            throw ParserException.createForMalformedManifest("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                        }
                        segment = new HlsMediaPlaylist.Segment(parseStringAttr2, j12, j18, str12, str13);
                        if (j18 != -1) {
                            j12 += j18;
                        }
                        str9 = str12;
                        str10 = str13;
                        j18 = -1;
                    } else {
                        String str14 = str9;
                        String str15 = str10;
                        if (next.startsWith(TAG_TARGET_DURATION)) {
                            arrayList2 = arrayList14;
                            j8 = 1000000 * parseIntAttr(next, REGEX_TARGET_DURATION);
                        } else {
                            arrayList2 = arrayList14;
                            if (next.startsWith(TAG_MEDIA_SEQUENCE)) {
                                j15 = parseLongAttr(next, REGEX_MEDIA_SEQUENCE);
                                arrayList10 = arrayList;
                                str9 = str14;
                                arrayList14 = arrayList2;
                                j11 = j15;
                                str10 = str15;
                                z2 = false;
                            } else if (next.startsWith(TAG_VERSION)) {
                                i6 = parseIntAttr(next, REGEX_VERSION);
                            } else {
                                if (next.startsWith(TAG_DEFINE)) {
                                    String parseOptionalStringAttr3 = parseOptionalStringAttr(next, REGEX_IMPORT, hashMap);
                                    if (parseOptionalStringAttr3 != null) {
                                        String str16 = hlsMultivariantPlaylist2.variableDefinitions.get(parseOptionalStringAttr3);
                                        if (str16 != null) {
                                            hashMap.put(parseOptionalStringAttr3, str16);
                                        }
                                    } else {
                                        hashMap.put(parseStringAttr(next, REGEX_NAME, hashMap), parseStringAttr(next, REGEX_VALUE, hashMap));
                                    }
                                    arrayList3 = arrayList;
                                    arrayList4 = arrayList12;
                                    arrayList5 = arrayList15;
                                    arrayList6 = arrayList13;
                                    arrayList7 = arrayList2;
                                    str2 = str11;
                                    j = j15;
                                    str3 = str15;
                                    i2 = i3;
                                } else if (next.startsWith(TAG_MEDIA_DURATION)) {
                                    j16 = parseTimeSecondsToUs(next, REGEX_MEDIA_DURATION);
                                    str8 = parseOptionalStringAttr(next, REGEX_MEDIA_TITLE, str7, hashMap);
                                } else {
                                    String str17 = str7;
                                    if (next.startsWith(TAG_SKIP)) {
                                        int parseIntAttr = parseIntAttr(next, REGEX_SKIPPED_SEGMENTS);
                                        Assertions.checkState(hlsMediaPlaylist2 != null && arrayList.isEmpty());
                                        str7 = str17;
                                        int i7 = (int) (j11 - ((HlsMediaPlaylist) Util.castNonNull(hlsMediaPlaylist)).mediaSequence);
                                        int i8 = parseIntAttr + i7;
                                        if (i7 < 0 || i8 > hlsMediaPlaylist2.segments.size()) {
                                            throw new DeltaUpdateException();
                                        }
                                        long j19 = j14;
                                        while (i7 < i8) {
                                            HlsMediaPlaylist.Segment segment2 = hlsMediaPlaylist2.segments.get(i7);
                                            ArrayList arrayList16 = arrayList15;
                                            ArrayList arrayList17 = arrayList13;
                                            if (j11 != hlsMediaPlaylist2.mediaSequence) {
                                                segment2 = segment2.copyWith(j19, (hlsMediaPlaylist2.discontinuitySequence - i4) + segment2.relativeDiscontinuitySequence);
                                            }
                                            arrayList.add(segment2);
                                            j19 += segment2.durationUs;
                                            long j20 = segment2.byteRangeLength;
                                            if (j20 != -1) {
                                                j12 = segment2.byteRangeOffset + j20;
                                            }
                                            int i9 = segment2.relativeDiscontinuitySequence;
                                            HlsMediaPlaylist.Segment segment3 = segment2.initializationSegment;
                                            DrmInitData drmInitData4 = segment2.drmInitData;
                                            String str18 = segment2.fullSegmentEncryptionKeyUri;
                                            String str19 = segment2.encryptionIV;
                                            if (str19 == null || !str19.equals(Long.toHexString(j15))) {
                                                str15 = segment2.encryptionIV;
                                            }
                                            j15++;
                                            i7++;
                                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                                            str14 = str18;
                                            j13 = j19;
                                            i5 = i9;
                                            segment = segment3;
                                            arrayList13 = arrayList17;
                                            drmInitData3 = drmInitData4;
                                            arrayList15 = arrayList16;
                                        }
                                        hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                        hlsMediaPlaylist2 = hlsMediaPlaylist;
                                        str9 = str14;
                                        j14 = j19;
                                        arrayList14 = arrayList2;
                                        str10 = str15;
                                        z2 = false;
                                    } else {
                                        ArrayList arrayList18 = arrayList15;
                                        arrayList6 = arrayList13;
                                        str7 = str17;
                                        if (next.startsWith(TAG_KEY)) {
                                            String parseStringAttr3 = parseStringAttr(next, REGEX_METHOD, hashMap);
                                            String parseOptionalStringAttr4 = parseOptionalStringAttr(next, REGEX_KEYFORMAT, KEYFORMAT_IDENTITY, hashMap);
                                            if (METHOD_NONE.equals(parseStringAttr3)) {
                                                treeMap.clear();
                                                str4 = null;
                                                parseOptionalStringAttr = null;
                                                drmInitData3 = null;
                                            } else {
                                                parseOptionalStringAttr = parseOptionalStringAttr(next, REGEX_IV, hashMap);
                                                if (KEYFORMAT_IDENTITY.equals(parseOptionalStringAttr4)) {
                                                    if (METHOD_AES_128.equals(parseStringAttr3)) {
                                                        str4 = parseStringAttr(next, REGEX_URI, hashMap);
                                                    }
                                                    str4 = null;
                                                } else {
                                                    String str20 = str11;
                                                    str11 = str20 == null ? parseEncryptionScheme(parseStringAttr3) : str20;
                                                    DrmInitData.SchemeData parseDrmSchemeData = parseDrmSchemeData(next, parseOptionalStringAttr4, hashMap);
                                                    if (parseDrmSchemeData != null) {
                                                        treeMap.put(parseOptionalStringAttr4, parseDrmSchemeData);
                                                        str4 = null;
                                                        drmInitData3 = null;
                                                    }
                                                    str4 = null;
                                                }
                                            }
                                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                                            str9 = str4;
                                            arrayList10 = arrayList;
                                            arrayList15 = arrayList18;
                                            arrayList14 = arrayList2;
                                            z2 = false;
                                            hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                        } else {
                                            String str21 = str11;
                                            if (next.startsWith(TAG_BYTERANGE)) {
                                                String[] split2 = Util.split(parseStringAttr(next, REGEX_BYTERANGE, hashMap), "@");
                                                j18 = Long.parseLong(split2[0]);
                                                if (split2.length > 1) {
                                                    j12 = Long.parseLong(split2[1]);
                                                }
                                            } else if (next.startsWith(TAG_DISCONTINUITY_SEQUENCE)) {
                                                i4 = Integer.parseInt(next.substring(next.indexOf(58) + 1));
                                                hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                arrayList10 = arrayList;
                                                str11 = str21;
                                                z5 = true;
                                                str9 = str14;
                                                arrayList15 = arrayList18;
                                                arrayList14 = arrayList2;
                                                str10 = str15;
                                                arrayList13 = arrayList6;
                                                z2 = false;
                                            } else if (next.equals(TAG_DISCONTINUITY)) {
                                                i5++;
                                            } else {
                                                if (next.startsWith(TAG_PROGRAM_DATE_TIME)) {
                                                    if (j10 == 0) {
                                                        j10 = Util.msToUs(Util.parseXsDateTime(next.substring(next.indexOf(58) + 1))) - j14;
                                                    }
                                                } else if (next.equals(TAG_GAP)) {
                                                    hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                    arrayList10 = arrayList;
                                                    str11 = str21;
                                                    str9 = str14;
                                                    arrayList15 = arrayList18;
                                                    arrayList14 = arrayList2;
                                                    str10 = str15;
                                                    arrayList13 = arrayList6;
                                                    z2 = false;
                                                    z7 = true;
                                                } else if (next.equals(TAG_INDEPENDENT_SEGMENTS)) {
                                                    hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                    arrayList10 = arrayList;
                                                    str11 = str21;
                                                    str9 = str14;
                                                    arrayList15 = arrayList18;
                                                    arrayList14 = arrayList2;
                                                    str10 = str15;
                                                    arrayList13 = arrayList6;
                                                    z2 = false;
                                                    z3 = true;
                                                } else if (next.equals(TAG_ENDLIST)) {
                                                    hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                    arrayList10 = arrayList;
                                                    str11 = str21;
                                                    str9 = str14;
                                                    arrayList15 = arrayList18;
                                                    arrayList14 = arrayList2;
                                                    str10 = str15;
                                                    arrayList13 = arrayList6;
                                                    z2 = false;
                                                    z6 = true;
                                                } else if (next.startsWith(TAG_RENDITION_REPORT)) {
                                                    arrayList12.add(new HlsMediaPlaylist.RenditionReport(Uri.parse(UriUtil.resolve(str, parseStringAttr(next, REGEX_URI, hashMap))), parseOptionalLongAttr(next, REGEX_LAST_MSN, -1L), parseOptionalIntAttr(next, REGEX_LAST_PART, -1)));
                                                } else if (next.startsWith(TAG_PRELOAD_HINT)) {
                                                    if (part2 == null && TYPE_PART.equals(parseStringAttr(next, REGEX_PRELOAD_HINT_TYPE, hashMap))) {
                                                        String parseStringAttr4 = parseStringAttr(next, REGEX_URI, hashMap);
                                                        long parseOptionalLongAttr = parseOptionalLongAttr(next, REGEX_BYTERANGE_START, -1L);
                                                        long parseOptionalLongAttr2 = parseOptionalLongAttr(next, REGEX_BYTERANGE_LENGTH, -1L);
                                                        long j21 = j15;
                                                        parseOptionalStringAttr = str15;
                                                        String segmentEncryptionIV = getSegmentEncryptionIV(j21, str14, parseOptionalStringAttr);
                                                        if (drmInitData3 != null || treeMap.isEmpty()) {
                                                            j6 = j21;
                                                        } else {
                                                            j6 = j21;
                                                            DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                            DrmInitData drmInitData5 = new DrmInitData(str21, schemeDataArr);
                                                            if (drmInitData2 == null) {
                                                                drmInitData2 = getPlaylistProtectionSchemes(str21, schemeDataArr);
                                                            }
                                                            drmInitData3 = drmInitData5;
                                                        }
                                                        if (parseOptionalLongAttr == -1 || parseOptionalLongAttr2 != -1) {
                                                            part2 = new HlsMediaPlaylist.Part(parseStringAttr4, segment, 0L, i5, j13, drmInitData3, str14, segmentEncryptionIV, parseOptionalLongAttr != -1 ? parseOptionalLongAttr : 0L, parseOptionalLongAttr2, false, false, true);
                                                        }
                                                        hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                        hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                        arrayList10 = arrayList;
                                                        str11 = str21;
                                                        str9 = str14;
                                                        j15 = j6;
                                                        arrayList15 = arrayList18;
                                                        arrayList14 = arrayList2;
                                                        z2 = false;
                                                    }
                                                } else {
                                                    long j22 = j15;
                                                    str3 = str15;
                                                    if (next.startsWith(TAG_PART)) {
                                                        String segmentEncryptionIV2 = getSegmentEncryptionIV(j22, str14, str3);
                                                        String parseStringAttr5 = parseStringAttr(next, REGEX_URI, hashMap);
                                                        HlsMediaPlaylist.Part part3 = part2;
                                                        ArrayList arrayList19 = arrayList12;
                                                        long parseDoubleAttr = (long) (parseDoubleAttr(next, REGEX_ATTR_DURATION) * 1000000.0d);
                                                        int i10 = i3;
                                                        boolean parseOptionalBooleanAttribute = parseOptionalBooleanAttribute(next, REGEX_INDEPENDENT, false) | (z3 && arrayList18.isEmpty());
                                                        boolean parseOptionalBooleanAttribute2 = parseOptionalBooleanAttribute(next, REGEX_GAP, false);
                                                        String parseOptionalStringAttr5 = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, hashMap);
                                                        if (parseOptionalStringAttr5 != null) {
                                                            String[] split3 = Util.split(parseOptionalStringAttr5, "@");
                                                            j3 = Long.parseLong(split3[0]);
                                                            if (split3.length > 1) {
                                                                j17 = Long.parseLong(split3[1]);
                                                            }
                                                            j2 = -1;
                                                        } else {
                                                            j2 = -1;
                                                            j3 = -1;
                                                        }
                                                        if (j3 == j2) {
                                                            j17 = 0;
                                                        }
                                                        if (drmInitData3 == null && !treeMap.isEmpty()) {
                                                            DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                            DrmInitData drmInitData6 = new DrmInitData(str21, schemeDataArr2);
                                                            if (drmInitData2 == null) {
                                                                drmInitData2 = getPlaylistProtectionSchemes(str21, schemeDataArr2);
                                                            }
                                                            drmInitData3 = drmInitData6;
                                                        }
                                                        arrayList18.add(new HlsMediaPlaylist.Part(parseStringAttr5, segment, parseDoubleAttr, i5, j13, drmInitData3, str14, segmentEncryptionIV2, j17, j3, parseOptionalBooleanAttribute2, parseOptionalBooleanAttribute, false));
                                                        j13 += parseDoubleAttr;
                                                        if (j3 != j2) {
                                                            j17 += j3;
                                                        }
                                                        arrayList12 = arrayList19;
                                                        str9 = str14;
                                                        arrayList14 = arrayList2;
                                                        i3 = i10;
                                                        part2 = part3;
                                                        z2 = false;
                                                        j15 = j22;
                                                        str11 = str21;
                                                        str10 = str3;
                                                        arrayList15 = arrayList18;
                                                        arrayList13 = arrayList6;
                                                        hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                        hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                    } else {
                                                        i2 = i3;
                                                        part = part2;
                                                        ArrayList arrayList20 = arrayList12;
                                                        arrayList5 = arrayList18;
                                                        if (!next.startsWith(TAG_DATERANGE)) {
                                                            arrayList8 = arrayList;
                                                        } else if (parseOptionalStringAttr(next, REGEX_CLASS, str7, hashMap).equals(DATERANGE_CLASS_INTERSTITIALS)) {
                                                            String parseStringAttr6 = parseStringAttr(next, REGEX_ID, hashMap);
                                                            String parseOptionalStringAttr6 = parseOptionalStringAttr(next, REGEX_ASSET_URI, hashMap);
                                                            Uri parse = parseOptionalStringAttr6 != null ? Uri.parse(parseOptionalStringAttr6) : null;
                                                            String parseOptionalStringAttr7 = parseOptionalStringAttr(next, REGEX_ASSET_LIST_URI, hashMap);
                                                            Uri parse2 = parseOptionalStringAttr7 != null ? Uri.parse(parseOptionalStringAttr7) : null;
                                                            long msToUs = Util.msToUs(Util.parseXsDateTime(parseStringAttr(next, REGEX_START_DATE, hashMap)));
                                                            String parseOptionalStringAttr8 = parseOptionalStringAttr(next, REGEX_END_DATE, hashMap);
                                                            long msToUs2 = parseOptionalStringAttr8 != null ? Util.msToUs(Util.parseXsDateTime(parseOptionalStringAttr8)) : -9223372036854775807L;
                                                            ArrayList arrayList21 = new ArrayList();
                                                            String parseOptionalStringAttr9 = parseOptionalStringAttr(next, REGEX_CUE, hashMap);
                                                            if (parseOptionalStringAttr9 != null) {
                                                                String[] split4 = Util.split(parseOptionalStringAttr9, StringUtils.COMMA);
                                                                str7 = str7;
                                                                int length = split4.length;
                                                                arrayList4 = arrayList20;
                                                                int i11 = 0;
                                                                while (i11 < length) {
                                                                    int i12 = length;
                                                                    String trim = split4[i11].trim();
                                                                    trim.hashCode();
                                                                    switch (trim.hashCode()) {
                                                                        case 79491:
                                                                            strArr = split4;
                                                                            if (trim.equals(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_PRE)) {
                                                                                c2 = 0;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 2430593:
                                                                            strArr = split4;
                                                                            if (trim.equals(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_ONCE)) {
                                                                                c2 = 1;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 2461856:
                                                                            strArr = split4;
                                                                            if (trim.equals("POST")) {
                                                                                c2 = 2;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        default:
                                                                            strArr = split4;
                                                                            c2 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c2) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                            arrayList21.add(trim);
                                                                            break;
                                                                    }
                                                                    i11++;
                                                                    split4 = strArr;
                                                                    length = i12;
                                                                }
                                                            } else {
                                                                str7 = str7;
                                                                arrayList4 = arrayList20;
                                                            }
                                                            double parseOptionalDoubleAttr = parseOptionalDoubleAttr(next, REGEX_ATTR_DURATION_PREFIXED, -1.0d);
                                                            long j23 = parseOptionalDoubleAttr >= 0.0d ? (long) (parseOptionalDoubleAttr * 1000000.0d) : -9223372036854775807L;
                                                            double parseOptionalDoubleAttr2 = parseOptionalDoubleAttr(next, REGEX_PLANNED_DURATION, -1.0d);
                                                            long j24 = parseOptionalDoubleAttr2 >= 0.0d ? (long) (parseOptionalDoubleAttr2 * 1000000.0d) : -9223372036854775807L;
                                                            boolean parseOptionalBooleanAttribute3 = parseOptionalBooleanAttribute(next, REGEX_END_ON_NEXT, false);
                                                            double parseOptionalDoubleAttr3 = parseOptionalDoubleAttr(next, REGEX_RESUME_OFFSET, Double.MIN_VALUE);
                                                            long j25 = parseOptionalDoubleAttr3 != Double.MIN_VALUE ? (long) (parseOptionalDoubleAttr3 * 1000000.0d) : -9223372036854775807L;
                                                            double parseOptionalDoubleAttr4 = parseOptionalDoubleAttr(next, REGEX_PLAYOUT_LIMIT, -1.0d);
                                                            long j26 = parseOptionalDoubleAttr4 >= 0.0d ? (long) (parseOptionalDoubleAttr4 * 1000000.0d) : -9223372036854775807L;
                                                            ArrayList arrayList22 = new ArrayList();
                                                            String parseOptionalStringAttr10 = parseOptionalStringAttr(next, REGEX_SNAP, hashMap);
                                                            if (parseOptionalStringAttr10 != null) {
                                                                String[] split5 = Util.split(parseOptionalStringAttr10, StringUtils.COMMA);
                                                                int length2 = split5.length;
                                                                str5 = str21;
                                                                int i13 = 0;
                                                                while (i13 < length2) {
                                                                    String[] strArr2 = split5;
                                                                    String trim2 = split5[i13].trim();
                                                                    trim2.hashCode();
                                                                    int i14 = length2;
                                                                    if (trim2.equals(HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN) || trim2.equals(HlsMediaPlaylist.Interstitial.SNAP_TYPE_OUT)) {
                                                                        arrayList22.add(trim2);
                                                                    }
                                                                    i13++;
                                                                    length2 = i14;
                                                                    split5 = strArr2;
                                                                }
                                                            } else {
                                                                str5 = str21;
                                                            }
                                                            ArrayList arrayList23 = new ArrayList();
                                                            String parseOptionalStringAttr11 = parseOptionalStringAttr(next, REGEX_RESTRICT, hashMap);
                                                            if (parseOptionalStringAttr11 != null) {
                                                                String[] split6 = Util.split(parseOptionalStringAttr11, StringUtils.COMMA);
                                                                int length3 = split6.length;
                                                                int i15 = 0;
                                                                while (i15 < length3) {
                                                                    String[] strArr3 = split6;
                                                                    String trim3 = split6[i15].trim();
                                                                    trim3.hashCode();
                                                                    int i16 = length3;
                                                                    if (trim3.equals(HlsMediaPlaylist.Interstitial.NAVIGATION_RESTRICTION_JUMP) || trim3.equals(HlsMediaPlaylist.Interstitial.NAVIGATION_RESTRICTION_SKIP)) {
                                                                        arrayList23.add(trim3);
                                                                    }
                                                                    i15++;
                                                                    length3 = i16;
                                                                    split6 = strArr3;
                                                                }
                                                            }
                                                            ImmutableList.Builder builder = new ImmutableList.Builder();
                                                            String substring = next.substring(17);
                                                            Matcher matcher2 = REGEX_CLIENT_DEFINED_ATTRIBUTE_PREFIX.matcher(substring);
                                                            while (matcher2.find()) {
                                                                String group = matcher2.group();
                                                                group.hashCode();
                                                                switch (group.hashCode()) {
                                                                    case -2136701954:
                                                                        matcher = matcher2;
                                                                        if (group.equals("X-SNAP=")) {
                                                                            c = 0;
                                                                            break;
                                                                        }
                                                                        c = 65535;
                                                                        break;
                                                                    case -148960310:
                                                                        matcher = matcher2;
                                                                        if (group.equals("X-PLAYOUT-LIMIT=")) {
                                                                            c = 1;
                                                                            break;
                                                                        }
                                                                        c = 65535;
                                                                        break;
                                                                    case 397239341:
                                                                        matcher = matcher2;
                                                                        if (group.equals("X-ASSET-LIST=")) {
                                                                            c = 2;
                                                                            break;
                                                                        }
                                                                        c = 65535;
                                                                        break;
                                                                    case 1472528844:
                                                                        matcher = matcher2;
                                                                        if (group.equals("X-RESTRICT=")) {
                                                                            c = 3;
                                                                            break;
                                                                        }
                                                                        c = 65535;
                                                                        break;
                                                                    case 1748487807:
                                                                        matcher = matcher2;
                                                                        if (group.equals("X-RESUME-OFFSET=")) {
                                                                            c = 4;
                                                                            break;
                                                                        }
                                                                        c = 65535;
                                                                        break;
                                                                    case 1814205923:
                                                                        matcher = matcher2;
                                                                        if (group.equals("X-ASSET-URI=")) {
                                                                            c = 5;
                                                                            break;
                                                                        }
                                                                        c = 65535;
                                                                        break;
                                                                    default:
                                                                        matcher = matcher2;
                                                                        c = 65535;
                                                                        break;
                                                                }
                                                                switch (c) {
                                                                    case 0:
                                                                    case 1:
                                                                    case 2:
                                                                    case 3:
                                                                    case 4:
                                                                    case 5:
                                                                        arrayList9 = arrayList;
                                                                        break;
                                                                    default:
                                                                        arrayList9 = arrayList;
                                                                        builder.add((Object) parseClientDefinedAttribute(substring, group.substring(0, group.length() - 1), hashMap));
                                                                        break;
                                                                }
                                                                matcher2 = matcher;
                                                                arrayList = arrayList9;
                                                            }
                                                            arrayList8 = arrayList;
                                                            if ((parse2 != null || parse == null) && (parse2 == null || parse != null)) {
                                                                arrayList7 = arrayList2;
                                                            } else {
                                                                arrayList7 = arrayList2;
                                                                arrayList7.add(new HlsMediaPlaylist.Interstitial(parseStringAttr6, parse, parse2, msToUs, msToUs2, j23, j24, arrayList21, parseOptionalBooleanAttribute3, j25, j26, arrayList22, arrayList23, builder.build()));
                                                            }
                                                            j = j22;
                                                            str2 = str5;
                                                            arrayList3 = arrayList8;
                                                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                            arrayList14 = arrayList7;
                                                            str10 = str3;
                                                            str9 = str14;
                                                            arrayList15 = arrayList5;
                                                            arrayList12 = arrayList4;
                                                            i3 = i2;
                                                            part2 = part;
                                                            arrayList13 = arrayList6;
                                                            z2 = false;
                                                            str11 = str2;
                                                            arrayList10 = arrayList3;
                                                            j15 = j;
                                                            hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                        } else {
                                                            arrayList8 = arrayList;
                                                            str7 = str7;
                                                        }
                                                        str5 = str21;
                                                        arrayList4 = arrayList20;
                                                        arrayList7 = arrayList2;
                                                        if (!next.startsWith("#")) {
                                                            String segmentEncryptionIV3 = getSegmentEncryptionIV(j22, str14, str3);
                                                            long j27 = j22 + 1;
                                                            String replaceVariableReferences = replaceVariableReferences(next, hashMap);
                                                            HlsMediaPlaylist.Segment segment4 = (HlsMediaPlaylist.Segment) hashMap2.get(replaceVariableReferences);
                                                            if (j18 == -1) {
                                                                j4 = 0;
                                                            } else {
                                                                if (z8 && segment == null && segment4 == null) {
                                                                    segment4 = new HlsMediaPlaylist.Segment(replaceVariableReferences, 0L, j12, null, null);
                                                                    hashMap2.put(replaceVariableReferences, segment4);
                                                                }
                                                                j4 = j12;
                                                            }
                                                            if (drmInitData3 != null || treeMap.isEmpty()) {
                                                                j5 = j27;
                                                                str6 = str5;
                                                                drmInitData = drmInitData3;
                                                            } else {
                                                                j5 = j27;
                                                                DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                str6 = str5;
                                                                drmInitData = new DrmInitData(str6, schemeDataArr3);
                                                                if (drmInitData2 == null) {
                                                                    drmInitData2 = getPlaylistProtectionSchemes(str6, schemeDataArr3);
                                                                }
                                                            }
                                                            HlsMediaPlaylist.Segment segment5 = new HlsMediaPlaylist.Segment(replaceVariableReferences, segment != null ? segment : segment4, str8, j16, i5, j14, drmInitData, str14, segmentEncryptionIV3, j4, j18, z7, arrayList5);
                                                            ArrayList arrayList24 = arrayList8;
                                                            arrayList24.add(segment5);
                                                            j13 = j14 + j16;
                                                            ArrayList arrayList25 = new ArrayList();
                                                            if (j18 != -1) {
                                                                j4 += j18;
                                                            }
                                                            j12 = j4;
                                                            arrayList15 = arrayList25;
                                                            arrayList10 = arrayList24;
                                                            str10 = str3;
                                                            str9 = str14;
                                                            drmInitData3 = drmInitData;
                                                            j16 = 0;
                                                            str8 = str7;
                                                            j14 = j13;
                                                            arrayList12 = arrayList4;
                                                            i3 = i2;
                                                            part2 = part;
                                                            arrayList13 = arrayList6;
                                                            z2 = false;
                                                            z7 = false;
                                                            j18 = -1;
                                                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                            str11 = str6;
                                                            arrayList14 = arrayList7;
                                                            j15 = j5;
                                                            hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                        }
                                                        j = j22;
                                                        str2 = str5;
                                                        arrayList3 = arrayList8;
                                                        hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                        arrayList14 = arrayList7;
                                                        str10 = str3;
                                                        str9 = str14;
                                                        arrayList15 = arrayList5;
                                                        arrayList12 = arrayList4;
                                                        i3 = i2;
                                                        part2 = part;
                                                        arrayList13 = arrayList6;
                                                        z2 = false;
                                                        str11 = str2;
                                                        arrayList10 = arrayList3;
                                                        j15 = j;
                                                        hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                    }
                                                }
                                                arrayList3 = arrayList;
                                                i2 = i3;
                                                arrayList4 = arrayList12;
                                                str2 = str21;
                                                arrayList5 = arrayList18;
                                                arrayList7 = arrayList2;
                                                j = j15;
                                                str3 = str15;
                                            }
                                            hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                                            arrayList10 = arrayList;
                                            str11 = str21;
                                            str9 = str14;
                                            arrayList15 = arrayList18;
                                            arrayList14 = arrayList2;
                                            str10 = str15;
                                            arrayList13 = arrayList6;
                                            z2 = false;
                                        }
                                        str10 = parseOptionalStringAttr;
                                        arrayList13 = arrayList6;
                                    }
                                }
                                part = part2;
                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                arrayList14 = arrayList7;
                                str10 = str3;
                                str9 = str14;
                                arrayList15 = arrayList5;
                                arrayList12 = arrayList4;
                                i3 = i2;
                                part2 = part;
                                arrayList13 = arrayList6;
                                z2 = false;
                                str11 = str2;
                                arrayList10 = arrayList3;
                                j15 = j;
                                hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                            }
                        }
                        arrayList10 = arrayList;
                        str9 = str14;
                        arrayList14 = arrayList2;
                        str10 = str15;
                        z2 = false;
                    }
                }
                arrayList10 = arrayList;
            }
        }
        int i17 = i3;
        HlsMediaPlaylist.Part part4 = part2;
        ArrayList arrayList26 = arrayList12;
        ArrayList arrayList27 = arrayList13;
        ArrayList arrayList28 = arrayList10;
        ArrayList arrayList29 = arrayList14;
        ArrayList arrayList30 = arrayList15;
        HashMap hashMap3 = new HashMap();
        int i18 = 0;
        while (i18 < arrayList26.size()) {
            ArrayList arrayList31 = arrayList26;
            HlsMediaPlaylist.RenditionReport renditionReport = (HlsMediaPlaylist.RenditionReport) arrayList31.get(i18);
            long j28 = renditionReport.lastMediaSequence;
            if (j28 == -1) {
                j28 = (j11 + arrayList28.size()) - (arrayList30.isEmpty() ? 1L : 0L);
            }
            int i19 = renditionReport.lastPartIndex;
            if (i19 != -1 || j9 == -9223372036854775807L) {
                i = 1;
            } else {
                i = 1;
                i19 = (arrayList30.isEmpty() ? ((HlsMediaPlaylist.Segment) Iterables.getLast(arrayList28)).parts : arrayList30).size() - 1;
            }
            Uri uri = renditionReport.playlistUri;
            hashMap3.put(uri, new HlsMediaPlaylist.RenditionReport(uri, j28, i19));
            i18 += i;
            arrayList26 = arrayList31;
        }
        if (part4 != null) {
            arrayList30.add(part4);
        }
        return new HlsMediaPlaylist(i17, str, arrayList27, j7, z4, j10, z5, i4, j11, i6, j8, j9, z3, z6, j10 != 0, drmInitData2, arrayList28, arrayList30, serverControl2, hashMap3, arrayList29);
    }

    private static DrmInitData getPlaylistProtectionSchemes(@Nullable String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i = 0; i < schemeDataArr.length; i++) {
            schemeDataArr2[i] = schemeDataArr[i].copyWithData(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    @Nullable
    private static String getSegmentEncryptionIV(long j, @Nullable String str, @Nullable String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int parseSelectionFlags(String str) {
        boolean parseOptionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_DEFAULT, false);
        ?? r0 = parseOptionalBooleanAttribute;
        if (parseOptionalBooleanAttribute(str, REGEX_FORCED, false)) {
            r0 = (parseOptionalBooleanAttribute ? 1 : 0) | 2;
        }
        return parseOptionalBooleanAttribute(str, REGEX_AUTOSELECT, false) ? r0 | 4 : r0;
    }

    private static int parseRoleFlags(String str, Map<String, String> map) {
        String parseOptionalStringAttr = parseOptionalStringAttr(str, REGEX_CHARACTERISTICS, map);
        if (TextUtils.isEmpty(parseOptionalStringAttr)) {
            return 0;
        }
        String[] split = Util.split(parseOptionalStringAttr, StringUtils.COMMA);
        int i = Util.contains(split, "public.accessibility.describes-video") ? 512 : 0;
        if (Util.contains(split, "public.accessibility.transcribes-spoken-dialog")) {
            i |= 4096;
        }
        if (Util.contains(split, "public.accessibility.describes-music-and-sound")) {
            i |= 1024;
        }
        return Util.contains(split, "public.easy-to-read") ? i | 8192 : i;
    }

    @Nullable
    private static DrmInitData.SchemeData parseDrmSchemeData(String str, String str2, Map<String, String> map) throws ParserException {
        String parseOptionalStringAttr = parseOptionalStringAttr(str, REGEX_KEYFORMATVERSIONS, "1", map);
        if (KEYFORMAT_WIDEVINE_PSSH_BINARY.equals(str2)) {
            String parseStringAttr = parseStringAttr(str, REGEX_URI, map);
            return new DrmInitData.SchemeData(C.WIDEVINE_UUID, "video/mp4", Base64.decode(parseStringAttr.substring(parseStringAttr.indexOf(44)), 0));
        }
        if (KEYFORMAT_WIDEVINE_PSSH_JSON.equals(str2)) {
            return new DrmInitData.SchemeData(C.WIDEVINE_UUID, "hls", Util.getUtf8Bytes(str));
        }
        if (!KEYFORMAT_PLAYREADY.equals(str2) || !"1".equals(parseOptionalStringAttr)) {
            return null;
        }
        String parseStringAttr2 = parseStringAttr(str, REGEX_URI, map);
        byte[] decode = Base64.decode(parseStringAttr2.substring(parseStringAttr2.indexOf(44)), 0);
        UUID uuid = C.PLAYREADY_UUID;
        return new DrmInitData.SchemeData(uuid, "video/mp4", PsshAtomUtil.buildPsshAtom(uuid, decode));
    }

    private static HlsMediaPlaylist.ServerControl parseServerControl(String str) {
        double parseOptionalDoubleAttr = parseOptionalDoubleAttr(str, REGEX_CAN_SKIP_UNTIL, -9.223372036854776E18d);
        long j = parseOptionalDoubleAttr == -9.223372036854776E18d ? -9223372036854775807L : (long) (parseOptionalDoubleAttr * 1000000.0d);
        boolean parseOptionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_CAN_SKIP_DATE_RANGES, false);
        double parseOptionalDoubleAttr2 = parseOptionalDoubleAttr(str, REGEX_HOLD_BACK, -9.223372036854776E18d);
        long j2 = parseOptionalDoubleAttr2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (parseOptionalDoubleAttr2 * 1000000.0d);
        double parseOptionalDoubleAttr3 = parseOptionalDoubleAttr(str, REGEX_PART_HOLD_BACK, -9.223372036854776E18d);
        return new HlsMediaPlaylist.ServerControl(j, parseOptionalBooleanAttribute, j2, parseOptionalDoubleAttr3 != -9.223372036854776E18d ? (long) (parseOptionalDoubleAttr3 * 1000000.0d) : -9223372036854775807L, parseOptionalBooleanAttribute(str, REGEX_CAN_BLOCK_RELOAD, false));
    }

    private static String parseEncryptionScheme(String str) {
        if (METHOD_SAMPLE_AES_CENC.equals(str) || METHOD_SAMPLE_AES_CTR.equals(str)) {
            return "cenc";
        }
        return "cbcs";
    }

    private static int parseIntAttr(String str, Pattern pattern) throws ParserException {
        return Integer.parseInt(parseStringAttr(str, pattern, Collections.emptyMap()));
    }

    private static int parseOptionalIntAttr(String str, Pattern pattern, int i) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))) : i;
    }

    private static long parseLongAttr(String str, Pattern pattern) throws ParserException {
        return Long.parseLong(parseStringAttr(str, pattern, Collections.emptyMap()));
    }

    private static long parseOptionalLongAttr(String str, Pattern pattern, long j) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) Assertions.checkNotNull(matcher.group(1))) : j;
    }

    private static long parseTimeSecondsToUs(String str, Pattern pattern) throws ParserException {
        return new BigDecimal(parseStringAttr(str, pattern, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static double parseDoubleAttr(String str, Pattern pattern) throws ParserException {
        return Double.parseDouble(parseStringAttr(str, pattern, Collections.emptyMap()));
    }

    private static String parseStringAttr(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String parseOptionalStringAttr = parseOptionalStringAttr(str, pattern, map);
        if (parseOptionalStringAttr != null) {
            return parseOptionalStringAttr;
        }
        throw ParserException.createForMalformedManifest("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    @Nullable
    private static String parseOptionalStringAttr(String str, Pattern pattern, Map<String, String> map) {
        return parseOptionalStringAttr(str, pattern, null, map);
    }

    private static String parseOptionalStringAttr(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) Assertions.checkNotNull(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : replaceVariableReferences(str2, map);
    }

    private static double parseOptionalDoubleAttr(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) Assertions.checkNotNull(matcher.group(1))) : d;
    }

    private static HlsMediaPlaylist.ClientDefinedAttribute parseClientDefinedAttribute(String str, String str2, Map<String, String> map) throws ParserException {
        String str3 = str2 + "=";
        int indexOf = str.indexOf(str3) + str3.length();
        String substring = str.substring(indexOf, (str.length() == indexOf + 1 ? 1 : 2) + indexOf);
        if (substring.startsWith("\"")) {
            return new HlsMediaPlaylist.ClientDefinedAttribute(str2, parseStringAttr(str, Pattern.compile(str2 + "=\"(.+?)\""), map), 0);
        }
        if (substring.equals("0x") || substring.equals("0X")) {
            return new HlsMediaPlaylist.ClientDefinedAttribute(str2, parseStringAttr(str, Pattern.compile(str2 + "=(0[xX][A-F0-9]+)"), map), 1);
        }
        return new HlsMediaPlaylist.ClientDefinedAttribute(str2, parseDoubleAttr(str, Pattern.compile(str2 + "=([\\d\\.]+)\\b")));
    }

    private static String replaceVariableReferences(String str, Map<String, String> map) {
        Matcher matcher = REGEX_VARIABLE_REFERENCE.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static boolean parseOptionalBooleanAttribute(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? BOOLEAN_TRUE.equals(matcher.group(1)) : z;
    }

    private static Pattern compileBooleanAttrPattern(String str) {
        return Pattern.compile(str + "=(" + BOOLEAN_FALSE + m.ad + BOOLEAN_TRUE + ")");
    }

    private static class LineIterator {
        private final Queue<String> extraLines;

        @Nullable
        private String next;
        private final BufferedReader reader;

        public LineIterator(Queue<String> queue, BufferedReader bufferedReader) {
            this.extraLines = queue;
            this.reader = bufferedReader;
        }

        public boolean hasNext() throws IOException {
            String trim;
            if (this.next != null) {
                return true;
            }
            if (!this.extraLines.isEmpty()) {
                this.next = (String) Assertions.checkNotNull(this.extraLines.poll());
                return true;
            }
            do {
                String readLine = this.reader.readLine();
                this.next = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.next = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String next() throws IOException {
            if (hasNext()) {
                String str = this.next;
                this.next = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }
}
