package io.bidmachine.media3.exoplayer.dash.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.ironsource.O6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mobilefuse.sdk.MobileFuseDefaults;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.Label;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.UriUtil;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.common.util.XmlPullParserUtil;
import io.bidmachine.media3.exoplayer.dash.manifest.SegmentBase;
import io.bidmachine.media3.exoplayer.upstream.ParsingLoadable;
import io.bidmachine.media3.extractor.metadata.emsg.EventMessage;
import io.bidmachine.media3.extractor.mp4.PsshAtomUtil;
import io.bidmachine.util.network.NetworkUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

@UnstableApi
/* loaded from: classes14.dex */
public class DashManifestParser extends DefaultHandler implements ParsingLoadable.Parser<DashManifest> {
    private static final String TAG = "MpdParser";
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern FRAME_RATE_PATTERN = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private static final Pattern CEA_608_ACCESSIBILITY_PATTERN = Pattern.compile("CC([1-4])=.*");
    private static final Pattern CEA_708_ACCESSIBILITY_PATTERN = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    private static final int[] DOLBY_AC4_CHANNEL_CONFIGURATION_MAPPING = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    private static final int[] MPEG_CHANNEL_CONFIGURATION_MAPPING = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    private static long getFinalAvailabilityTimeOffset(long j, long j2) {
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        if (j == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j;
    }

    public DashManifestParser() {
        try {
            this.xmlParserFactory = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.media3.exoplayer.upstream.ParsingLoadable.Parser
    public DashManifest parse(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser newPullParser = this.xmlParserFactory.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() != 2 || !"MPD".equals(newPullParser.getName())) {
                throw ParserException.createForMalformedManifest("inputStream does not contain a valid media presentation description", null);
            }
            return parseMediaPresentationDescription(newPullParser, uri);
        } catch (XmlPullParserException e) {
            throw ParserException.createForMalformedManifest(null, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01e6 A[LOOP:0: B:18:0x00a2->B:26:0x01e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected DashManifest parseMediaPresentationDescription(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        long j;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        long j2;
        Throwable th;
        ArrayList arrayList3;
        long j3;
        boolean z2;
        long j4;
        DashManifestParser dashManifestParser = this;
        boolean isDvbProfileDeclared = dashManifestParser.isDvbProfileDeclared(dashManifestParser.parseProfiles(xmlPullParser, "profiles", new String[0]));
        long j5 = -9223372036854775807L;
        long parseDateTime = parseDateTime(xmlPullParser, "availabilityStartTime", -9223372036854775807L);
        long parseDuration = parseDuration(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long parseDuration2 = parseDuration(xmlPullParser, "minBufferTime", -9223372036854775807L);
        Throwable th2 = null;
        boolean equals = POBAdDescriptor.DYNAMIC_PRICE_BID.equals(xmlPullParser.getAttributeValue(null, "type"));
        long parseDuration3 = equals ? parseDuration(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long parseDuration4 = equals ? parseDuration(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long parseDuration5 = equals ? parseDuration(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        long parseDateTime2 = parseDateTime(xmlPullParser, "publishTime", -9223372036854775807L);
        long j6 = equals ? 0L : -9223372036854775807L;
        boolean z3 = true;
        ArrayList newArrayList = Lists.newArrayList(new BaseUrl(uri.toString(), uri.toString(), isDvbProfileDeclared ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        long j7 = equals ? -9223372036854775807L : 0L;
        ProgramInformation programInformation = null;
        UtcTimingElement utcTimingElement = null;
        Uri uri2 = null;
        ServiceDescriptionElement serviceDescriptionElement = null;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "BaseURL")) {
                if (!z5) {
                    j6 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser, j6);
                    z5 = z3;
                }
                arrayList5.addAll(dashManifestParser.parseBaseUrl(xmlPullParser, newArrayList, isDvbProfileDeclared));
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "ProgramInformation")) {
                programInformation = parseProgramInformation(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "UTCTiming")) {
                utcTimingElement = parseUtcTiming(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, NetworkUtils.HEADER_LOCATION)) {
                uri2 = UriUtil.resolveToUri(uri.toString(), xmlPullParser.nextText());
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "ServiceDescription")) {
                serviceDescriptionElement = parseServiceDescription(xmlPullParser);
            } else {
                if (XmlPullParserUtil.isStartTag(xmlPullParser, "Period") && !z4) {
                    j = j6;
                    ArrayList arrayList6 = arrayList4;
                    arrayList = arrayList5;
                    arrayList2 = newArrayList;
                    z = z3;
                    j2 = j5;
                    th = th2;
                    Pair<Period, Long> parsePeriod = parsePeriod(xmlPullParser, !arrayList5.isEmpty() ? arrayList5 : newArrayList, j7, j, parseDateTime, parseDuration4, isDvbProfileDeclared);
                    Period period = (Period) parsePeriod.first;
                    if (period.startMs != j2) {
                        long longValue = ((Long) parsePeriod.second).longValue();
                        if (longValue == j2) {
                            arrayList3 = arrayList6;
                            j3 = j2;
                        } else {
                            j3 = period.startMs + longValue;
                            arrayList3 = arrayList6;
                        }
                        arrayList3.add(period);
                        j7 = j3;
                        z2 = z4;
                    } else {
                        if (!equals) {
                            throw ParserException.createForMalformedManifest("Unable to determine start of period " + arrayList6.size(), th);
                        }
                        arrayList3 = arrayList6;
                        z2 = z;
                    }
                    z4 = z2;
                } else {
                    j = j6;
                    arrayList = arrayList5;
                    arrayList2 = newArrayList;
                    z = z3;
                    j2 = j5;
                    th = th2;
                    arrayList3 = arrayList4;
                    maybeSkipTag(xmlPullParser);
                }
                j6 = j;
                if (XmlPullParserUtil.isEndTag(xmlPullParser, "MPD")) {
                    arrayList4 = arrayList3;
                    th2 = th;
                    arrayList5 = arrayList;
                    z3 = z;
                    newArrayList = arrayList2;
                    j5 = j2;
                    dashManifestParser = this;
                } else {
                    if (parseDuration == j2) {
                        if (j7 != j2) {
                            j4 = j7;
                            if (!arrayList3.isEmpty()) {
                                throw ParserException.createForMalformedManifest("No periods found.", th);
                            }
                            return buildMediaPresentationDescription(parseDateTime, j4, parseDuration2, equals, parseDuration3, parseDuration4, parseDuration5, parseDateTime2, programInformation, utcTimingElement, serviceDescriptionElement, uri2, arrayList3);
                        }
                        if (!equals) {
                            throw ParserException.createForMalformedManifest("Unable to determine duration of static manifest.", th);
                        }
                    }
                    j4 = parseDuration;
                    if (!arrayList3.isEmpty()) {
                    }
                }
            }
            arrayList = arrayList5;
            arrayList2 = newArrayList;
            z = z3;
            j2 = j5;
            th = th2;
            arrayList3 = arrayList4;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "MPD")) {
            }
        }
    }

    protected DashManifest buildMediaPresentationDescription(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, @Nullable ProgramInformation programInformation, @Nullable UtcTimingElement utcTimingElement, @Nullable ServiceDescriptionElement serviceDescriptionElement, @Nullable Uri uri, List<Period> list) {
        return new DashManifest(j, j2, j3, z, j4, j5, j6, j7, programInformation, utcTimingElement, serviceDescriptionElement, uri, list);
    }

    protected UtcTimingElement parseUtcTiming(XmlPullParser xmlPullParser) {
        return buildUtcTimingElement(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    protected UtcTimingElement buildUtcTimingElement(String str, String str2) {
        return new UtcTimingElement(str, str2);
    }

    protected ServiceDescriptionElement parseServiceDescription(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        float f = -3.4028235E38f;
        float f2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Latency")) {
                j = parseLong(xmlPullParser, "target", -9223372036854775807L);
                j2 = parseLong(xmlPullParser, "min", -9223372036854775807L);
                j3 = parseLong(xmlPullParser, "max", -9223372036854775807L);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "PlaybackRate")) {
                f = parseFloat(xmlPullParser, "min", -3.4028235E38f);
                f2 = parseFloat(xmlPullParser, "max", -3.4028235E38f);
            }
            long j4 = j;
            long j5 = j2;
            long j6 = j3;
            float f3 = f;
            float f4 = f2;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "ServiceDescription")) {
                return new ServiceDescriptionElement(j4, j5, j6, f3, f4);
            }
            j = j4;
            j2 = j5;
            j3 = j6;
            f = f3;
            f2 = f4;
        }
    }

    protected Pair<Period, Long> parsePeriod(XmlPullParser xmlPullParser, List<BaseUrl> list, long j, long j2, long j3, long j4, boolean z) throws XmlPullParserException, IOException {
        long j5;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        long j6;
        SegmentBase parseSegmentTemplate;
        DashManifestParser dashManifestParser = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        long parseDuration = parseDuration(xmlPullParser2, "start", j);
        long j7 = -9223372036854775807L;
        long j8 = j3 != -9223372036854775807L ? j3 + parseDuration : -9223372036854775807L;
        long parseDuration2 = parseDuration(xmlPullParser2, IronSourceConstants.EVENTS_DURATION, -9223372036854775807L);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long j9 = j2;
        boolean z2 = false;
        long j10 = -9223372036854775807L;
        SegmentBase segmentBase = null;
        Descriptor descriptor = null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "BaseURL")) {
                if (!z2) {
                    j9 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser2, j9);
                    z2 = true;
                }
                arrayList6.addAll(dashManifestParser.parseBaseUrl(xmlPullParser2, list, z));
                arrayList3 = arrayList5;
                arrayList = arrayList6;
                j6 = j7;
                obj = obj2;
                arrayList2 = arrayList4;
            } else {
                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "AdaptationSet")) {
                    j5 = j9;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    arrayList2.add(parseAdaptationSet(xmlPullParser, !arrayList6.isEmpty() ? arrayList6 : list, segmentBase, parseDuration2, j9, j10, j8, j4, z));
                    xmlPullParser2 = xmlPullParser;
                    arrayList3 = arrayList5;
                } else {
                    j5 = j9;
                    ArrayList arrayList7 = arrayList5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    xmlPullParser2 = xmlPullParser;
                    if (XmlPullParserUtil.isStartTag(xmlPullParser2, "EventStream")) {
                        arrayList7.add(parseEventStream(xmlPullParser));
                        arrayList3 = arrayList7;
                    } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentBase")) {
                        arrayList3 = arrayList7;
                        segmentBase = parseSegmentBase(xmlPullParser2, null);
                        obj = null;
                        j9 = j5;
                        j6 = -9223372036854775807L;
                    } else {
                        arrayList3 = arrayList7;
                        if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentList")) {
                            long parseAvailabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser2, -9223372036854775807L);
                            obj = null;
                            parseSegmentTemplate = parseSegmentList(xmlPullParser, null, j8, parseDuration2, j5, parseAvailabilityTimeOffsetUs, j4);
                            j10 = parseAvailabilityTimeOffsetUs;
                            j9 = j5;
                            j6 = -9223372036854775807L;
                        } else {
                            obj = null;
                            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentTemplate")) {
                                long parseAvailabilityTimeOffsetUs2 = parseAvailabilityTimeOffsetUs(xmlPullParser2, -9223372036854775807L);
                                j6 = -9223372036854775807L;
                                parseSegmentTemplate = parseSegmentTemplate(xmlPullParser, null, ImmutableList.of(), j8, parseDuration2, j5, parseAvailabilityTimeOffsetUs2, j4);
                                j10 = parseAvailabilityTimeOffsetUs2;
                                j9 = j5;
                            } else {
                                j6 = -9223372036854775807L;
                                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "AssetIdentifier")) {
                                    descriptor = parseDescriptor(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    maybeSkipTag(xmlPullParser);
                                }
                                j9 = j5;
                            }
                        }
                        segmentBase = parseSegmentTemplate;
                    }
                }
                obj = null;
                j6 = -9223372036854775807L;
                j9 = j5;
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser2, "Period")) {
                return Pair.create(buildPeriod(attributeValue, parseDuration, arrayList2, arrayList3, descriptor), Long.valueOf(parseDuration2));
            }
            arrayList4 = arrayList2;
            arrayList6 = arrayList;
            obj2 = obj;
            arrayList5 = arrayList3;
            j7 = j6;
            dashManifestParser = this;
        }
    }

    protected Period buildPeriod(@Nullable String str, long j, List<AdaptationSet> list, List<EventStream> list2, @Nullable Descriptor descriptor) {
        return new Period(str, j, list, list2, descriptor);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0362 A[LOOP:0: B:2:0x008d->B:11:0x0362, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0320 A[EDGE_INSN: B:12:0x0320->B:13:0x0320 BREAK  A[LOOP:0: B:2:0x008d->B:11:0x0362], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected AdaptationSet parseAdaptationSet(XmlPullParser xmlPullParser, List<BaseUrl> list, @Nullable SegmentBase segmentBase, long j, long j2, long j3, long j4, long j5, boolean z) throws XmlPullParserException, IOException {
        Object obj;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList<DrmInitData.SchemeData> arrayList5;
        String str;
        String str2;
        String str3;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList<Descriptor> arrayList9;
        long j6;
        long j7;
        int i;
        ArrayList<Descriptor> arrayList10;
        ArrayList arrayList11;
        long parseAvailabilityTimeOffsetUs;
        int i2;
        List<BaseUrl> list2;
        DashManifestParser dashManifestParser = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long parseLong = parseLong(xmlPullParser2, "id", -1L);
        int parseContentType = parseContentType(xmlPullParser);
        String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, "scte214:supplementalCodecs");
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, "scte214:supplementalProfiles");
        int parseInt = parseInt(xmlPullParser2, "width", -1);
        int parseInt2 = parseInt(xmlPullParser2, "height", -1);
        float parseFrameRate = parseFrameRate(xmlPullParser2, -1.0f);
        int parseInt3 = parseInt(xmlPullParser2, "audioSamplingRate", -1);
        String str4 = O6.q;
        String attributeValue5 = xmlPullParser2.getAttributeValue(null, O6.q);
        String attributeValue6 = xmlPullParser2.getAttributeValue(null, "label");
        ArrayList arrayList12 = new ArrayList();
        ArrayList<DrmInitData.SchemeData> arrayList13 = new ArrayList<>();
        ArrayList<Descriptor> arrayList14 = new ArrayList<>();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        ArrayList arrayList19 = new ArrayList();
        ArrayList arrayList20 = new ArrayList();
        SegmentBase segmentBase2 = segmentBase;
        int i3 = -1;
        ArrayList arrayList21 = arrayList12;
        boolean z2 = false;
        String str5 = null;
        String str6 = attributeValue5;
        long j8 = j2;
        long j9 = j3;
        while (true) {
            xmlPullParser.next();
            ArrayList arrayList22 = arrayList19;
            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "BaseURL")) {
                if (!z2) {
                    j8 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser2, j8);
                    z2 = true;
                }
                arrayList20.addAll(dashManifestParser.parseBaseUrl(xmlPullParser2, list, z));
                j8 = j8;
                arrayList = arrayList18;
                arrayList2 = arrayList17;
                arrayList3 = arrayList16;
                arrayList4 = arrayList15;
                arrayList5 = arrayList13;
                str2 = str4;
                str3 = attributeValue2;
                arrayList6 = arrayList20;
                arrayList11 = arrayList21;
                arrayList8 = arrayList22;
                arrayList10 = arrayList14;
            } else {
                long j10 = j8;
                ArrayList<Descriptor> arrayList23 = arrayList14;
                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "ContentProtection")) {
                    Pair<String, DrmInitData.SchemeData> parseContentProtection = parseContentProtection(xmlPullParser);
                    Object obj2 = parseContentProtection.first;
                    if (obj2 != null) {
                        str5 = (String) obj2;
                    }
                    Object obj3 = parseContentProtection.second;
                    if (obj3 != null) {
                        arrayList13.add((DrmInitData.SchemeData) obj3);
                    }
                    arrayList = arrayList18;
                    arrayList2 = arrayList17;
                    arrayList3 = arrayList16;
                    arrayList4 = arrayList15;
                    arrayList5 = arrayList13;
                    str2 = str4;
                    str3 = attributeValue2;
                    arrayList6 = arrayList20;
                    arrayList11 = arrayList21;
                    arrayList8 = arrayList22;
                    arrayList10 = arrayList23;
                    j8 = j10;
                } else {
                    if (XmlPullParserUtil.isStartTag(xmlPullParser2, "ContentComponent")) {
                        obj = null;
                        String checkLanguageConsistency = checkLanguageConsistency(str6, xmlPullParser2.getAttributeValue(null, str4));
                        parseContentType = checkContentTypeConsistency(parseContentType, parseContentType(xmlPullParser));
                        str6 = checkLanguageConsistency;
                    } else {
                        obj = null;
                        if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Role")) {
                            arrayList16.add(parseDescriptor(xmlPullParser2, "Role"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "AudioChannelConfiguration")) {
                            i3 = dashManifestParser.parseAudioChannelConfiguration(xmlPullParser2, attributeValue2);
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Accessibility")) {
                            arrayList15.add(parseDescriptor(xmlPullParser2, "Accessibility"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "EssentialProperty")) {
                            arrayList17.add(parseDescriptor(xmlPullParser2, "EssentialProperty"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SupplementalProperty")) {
                            arrayList18.add(parseDescriptor(xmlPullParser2, "SupplementalProperty"));
                        } else {
                            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Representation")) {
                                if (arrayList20.isEmpty()) {
                                    i2 = parseContentType;
                                    list2 = list;
                                } else {
                                    i2 = parseContentType;
                                    list2 = arrayList20;
                                }
                                arrayList = arrayList18;
                                arrayList2 = arrayList17;
                                arrayList3 = arrayList16;
                                arrayList4 = arrayList15;
                                arrayList9 = arrayList23;
                                arrayList5 = arrayList13;
                                str = str6;
                                arrayList7 = arrayList21;
                                str2 = str4;
                                str3 = attributeValue2;
                                arrayList6 = arrayList20;
                                RepresentationInfo parseRepresentation = parseRepresentation(xmlPullParser, list2, attributeValue, attributeValue2, attributeValue3, attributeValue4, parseInt, parseInt2, parseFrameRate, i3, parseInt3, str, arrayList3, arrayList4, arrayList2, arrayList, segmentBase2, j4, j, j10, j9, j5, z);
                                int checkContentTypeConsistency = checkContentTypeConsistency(i2, MimeTypes.getTrackType(parseRepresentation.format.sampleMimeType));
                                arrayList8 = arrayList22;
                                arrayList8.add(parseRepresentation);
                                xmlPullParser2 = xmlPullParser;
                                parseAvailabilityTimeOffsetUs = j9;
                                parseContentType = checkContentTypeConsistency;
                                j8 = j10;
                            } else {
                                int i4 = parseContentType;
                                arrayList = arrayList18;
                                arrayList2 = arrayList17;
                                arrayList3 = arrayList16;
                                arrayList4 = arrayList15;
                                arrayList5 = arrayList13;
                                str = str6;
                                str2 = str4;
                                str3 = attributeValue2;
                                arrayList6 = arrayList20;
                                arrayList7 = arrayList21;
                                arrayList8 = arrayList22;
                                arrayList9 = arrayList23;
                                j6 = j10;
                                if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentBase")) {
                                    parseAvailabilityTimeOffsetUs = j9;
                                    segmentBase2 = parseSegmentBase(xmlPullParser, (SegmentBase.SingleSegmentBase) segmentBase2);
                                    parseContentType = i4;
                                    j8 = j6;
                                    arrayList10 = arrayList9;
                                    arrayList11 = arrayList7;
                                    str6 = str;
                                    xmlPullParser2 = xmlPullParser;
                                    if (!XmlPullParserUtil.isEndTag(xmlPullParser2, "AdaptationSet")) {
                                        break;
                                    }
                                    arrayList14 = arrayList10;
                                    arrayList19 = arrayList8;
                                    j9 = parseAvailabilityTimeOffsetUs;
                                    arrayList17 = arrayList2;
                                    arrayList16 = arrayList3;
                                    arrayList15 = arrayList4;
                                    arrayList13 = arrayList5;
                                    str4 = str2;
                                    attributeValue2 = str3;
                                    arrayList20 = arrayList6;
                                    dashManifestParser = this;
                                    arrayList21 = arrayList11;
                                    arrayList18 = arrayList;
                                } else {
                                    if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentList")) {
                                        parseAvailabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser, j9);
                                        i = i4;
                                        segmentBase2 = parseSegmentList(xmlPullParser, (SegmentBase.SegmentList) segmentBase2, j4, j, j6, parseAvailabilityTimeOffsetUs, j5);
                                        xmlPullParser2 = xmlPullParser;
                                    } else {
                                        j7 = j9;
                                        i = i4;
                                        if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTemplate")) {
                                            parseAvailabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser, j7);
                                            xmlPullParser2 = xmlPullParser;
                                            segmentBase2 = parseSegmentTemplate(xmlPullParser, (SegmentBase.SegmentTemplate) segmentBase2, arrayList, j4, j, j6, parseAvailabilityTimeOffsetUs, j5);
                                        } else {
                                            xmlPullParser2 = xmlPullParser;
                                            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "InbandEventStream")) {
                                                arrayList10 = arrayList9;
                                                arrayList10.add(parseDescriptor(xmlPullParser2, "InbandEventStream"));
                                                arrayList11 = arrayList7;
                                            } else {
                                                arrayList10 = arrayList9;
                                                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Label")) {
                                                    arrayList11 = arrayList7;
                                                    arrayList11.add(parseLabel(xmlPullParser));
                                                } else {
                                                    arrayList11 = arrayList7;
                                                    if (XmlPullParserUtil.isStartTag(xmlPullParser)) {
                                                        parseAdaptationSetChild(xmlPullParser);
                                                    }
                                                }
                                            }
                                            parseAvailabilityTimeOffsetUs = j7;
                                            j8 = j6;
                                            parseContentType = i;
                                            str6 = str;
                                            if (!XmlPullParserUtil.isEndTag(xmlPullParser2, "AdaptationSet")) {
                                            }
                                        }
                                    }
                                    j8 = j6;
                                    parseContentType = i;
                                }
                            }
                            arrayList10 = arrayList9;
                            arrayList11 = arrayList7;
                            str6 = str;
                            if (!XmlPullParserUtil.isEndTag(xmlPullParser2, "AdaptationSet")) {
                            }
                        }
                        i = parseContentType;
                        arrayList = arrayList18;
                        arrayList2 = arrayList17;
                        arrayList3 = arrayList16;
                        arrayList4 = arrayList15;
                        arrayList5 = arrayList13;
                        str = str6;
                        str2 = str4;
                        str3 = attributeValue2;
                        arrayList6 = arrayList20;
                        arrayList11 = arrayList21;
                        arrayList8 = arrayList22;
                        arrayList10 = arrayList23;
                        j6 = j10;
                        j7 = j9;
                        parseAvailabilityTimeOffsetUs = j7;
                        j8 = j6;
                        parseContentType = i;
                        str6 = str;
                        if (!XmlPullParserUtil.isEndTag(xmlPullParser2, "AdaptationSet")) {
                        }
                    }
                    arrayList = arrayList18;
                    arrayList2 = arrayList17;
                    arrayList3 = arrayList16;
                    arrayList4 = arrayList15;
                    arrayList5 = arrayList13;
                    str2 = str4;
                    str3 = attributeValue2;
                    arrayList6 = arrayList20;
                    arrayList11 = arrayList21;
                    arrayList8 = arrayList22;
                    arrayList10 = arrayList23;
                    j8 = j10;
                    parseAvailabilityTimeOffsetUs = j9;
                    if (!XmlPullParserUtil.isEndTag(xmlPullParser2, "AdaptationSet")) {
                    }
                }
            }
            parseAvailabilityTimeOffsetUs = j9;
            if (!XmlPullParserUtil.isEndTag(xmlPullParser2, "AdaptationSet")) {
            }
        }
        ArrayList arrayList24 = new ArrayList(arrayList8.size());
        for (int i5 = 0; i5 < arrayList8.size(); i5++) {
            arrayList24.add(buildRepresentation((RepresentationInfo) arrayList8.get(i5), attributeValue6, arrayList11, str5, arrayList5, arrayList10));
        }
        return buildAdaptationSet(parseLong, parseContentType, arrayList24, arrayList4, arrayList2, arrayList);
    }

    protected AdaptationSet buildAdaptationSet(long j, int i, List<Representation> list, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4) {
        return new AdaptationSet(j, i, list, list2, list3, list4);
    }

    protected int parseContentType(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Pair<String, DrmInitData.SchemeData> parseContentProtection(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        UUID uuid;
        String str;
        String str2;
        String str3;
        ?? r5;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String lowerCase = Ascii.toLowerCase(attributeValue);
            lowerCase.hashCode();
            switch (lowerCase) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = C.CLEARKEY_UUID;
                    str = null;
                    str2 = str;
                    str3 = str2;
                    r5 = str2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = C.PLAYREADY_UUID;
                    str = null;
                    str2 = str;
                    str3 = str2;
                    r5 = str2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = C.WIDEVINE_UUID;
                    str = null;
                    str2 = str;
                    str3 = str2;
                    r5 = str2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    str = xmlPullParser.getAttributeValue(null, "value");
                    String attributeValueIgnorePrefix = XmlPullParserUtil.getAttributeValueIgnorePrefix(xmlPullParser, "default_KID");
                    if (TextUtils.isEmpty(attributeValueIgnorePrefix) || MobileFuseDefaults.ADVERTISING_ID_ZEROS.equals(attributeValueIgnorePrefix)) {
                        Log.w(TAG, "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        uuid = null;
                        str2 = null;
                        str3 = str2;
                        r5 = str2;
                        break;
                    } else {
                        String[] split = attributeValueIgnorePrefix.split("\\s+");
                        UUID[] uuidArr = new UUID[split.length];
                        for (int i = 0; i < split.length; i++) {
                            uuidArr[i] = UUID.fromString(split[i]);
                        }
                        uuid = C.COMMON_PSSH_UUID;
                        byte[] buildPsshAtom = PsshAtomUtil.buildPsshAtom(uuid, uuidArr, null);
                        str3 = null;
                        r5 = buildPsshAtom;
                        break;
                    }
                    break;
            }
            do {
                xmlPullParser.next();
                if ((!XmlPullParserUtil.isStartTag(xmlPullParser, "clearkey:Laurl") || XmlPullParserUtil.isStartTag(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r5 = r5;
                } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "ms:laurl")) {
                    str3 = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    r5 = r5;
                } else if (r5 == 0 && XmlPullParserUtil.isStartTagIgnorePrefix(xmlPullParser, "pssh") && xmlPullParser.next() == 4) {
                    byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                    UUID parseUuid = PsshAtomUtil.parseUuid(decode);
                    if (parseUuid == null) {
                        Log.w(TAG, "Skipping malformed cenc:pssh data");
                        uuid = parseUuid;
                        r5 = 0;
                    } else {
                        r5 = decode;
                        uuid = parseUuid;
                    }
                } else {
                    if (r5 == 0) {
                        UUID uuid2 = C.PLAYREADY_UUID;
                        if (uuid2.equals(uuid) && XmlPullParserUtil.isStartTag(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r5 = PsshAtomUtil.buildPsshAtom(uuid2, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    maybeSkipTag(xmlPullParser);
                    r5 = r5;
                }
            } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "ContentProtection"));
            return Pair.create(str, uuid != null ? new DrmInitData.SchemeData(uuid, str3, "video/mp4", r5) : null);
        }
        uuid = null;
        str = null;
        str2 = str;
        str3 = str2;
        r5 = str2;
        do {
            xmlPullParser.next();
            if (!XmlPullParserUtil.isStartTag(xmlPullParser, "clearkey:Laurl")) {
            }
            str3 = xmlPullParser.getText();
            r5 = r5;
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "ContentProtection"));
        return Pair.create(str, uuid != null ? new DrmInitData.SchemeData(uuid, str3, "video/mp4", r5) : null);
    }

    protected void parseAdaptationSetChild(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        maybeSkipTag(xmlPullParser);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x021d A[LOOP:0: B:2:0x007b->B:11:0x021d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01c1 A[EDGE_INSN: B:12:0x01c1->B:13:0x01c1 BREAK  A[LOOP:0: B:2:0x007b->B:11:0x021d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected RepresentationInfo parseRepresentation(XmlPullParser xmlPullParser, List<BaseUrl> list, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, float f, int i3, int i4, @Nullable String str5, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4, List<Descriptor> list5, @Nullable SegmentBase segmentBase, long j, long j2, long j3, long j4, long j5, boolean z) throws XmlPullParserException, IOException {
        long j6;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str6;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i5;
        long parseAvailabilityTimeOffsetUs;
        ArrayList arrayList7;
        SegmentBase segmentBase2;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        DashManifestParser dashManifestParser = this;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        int parseInt = parseInt(xmlPullParser, "bandwidth", -1);
        String parseString = parseString(xmlPullParser, "mimeType", str);
        String parseString2 = parseString(xmlPullParser, "codecs", str2);
        String parseString3 = parseString(xmlPullParser, "scte214:supplementalCodecs", str3);
        String parseString4 = parseString(xmlPullParser, "scte214:supplementalProfiles", str4);
        int parseInt2 = parseInt(xmlPullParser, "width", i);
        int parseInt3 = parseInt(xmlPullParser, "height", i2);
        float parseFrameRate = parseFrameRate(xmlPullParser, f);
        int parseInt4 = parseInt(xmlPullParser, "audioSamplingRate", i4);
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList(list4);
        ArrayList arrayList15 = new ArrayList(list5);
        ArrayList arrayList16 = new ArrayList();
        int i6 = i3;
        long j7 = j3;
        boolean z2 = false;
        String str7 = null;
        SegmentBase segmentBase3 = segmentBase;
        long j8 = j4;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "BaseURL")) {
                if (!z2) {
                    j7 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser, j7);
                    z2 = true;
                }
                arrayList16.addAll(dashManifestParser.parseBaseUrl(xmlPullParser, list, z));
                j7 = j7;
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "AudioChannelConfiguration")) {
                segmentBase2 = segmentBase3;
                i5 = dashManifestParser.parseAudioChannelConfiguration(xmlPullParser, parseString2);
                arrayList10 = arrayList16;
                str6 = parseString2;
                arrayList5 = arrayList12;
                arrayList6 = arrayList14;
                arrayList11 = arrayList10;
                if (!XmlPullParserUtil.isEndTag(xmlPullParser, "Representation")) {
                    break;
                }
                dashManifestParser = this;
                arrayList14 = arrayList6;
                arrayList12 = arrayList5;
                segmentBase3 = segmentBase2;
                arrayList16 = arrayList11;
                parseString2 = str6;
                i6 = i5;
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentBase")) {
                segmentBase3 = dashManifestParser.parseSegmentBase(xmlPullParser, (SegmentBase.SingleSegmentBase) segmentBase3);
            } else {
                if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentList")) {
                    parseAvailabilityTimeOffsetUs = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser, j8);
                    j6 = j7;
                    arrayList9 = arrayList16;
                    arrayList = arrayList14;
                    arrayList2 = arrayList15;
                    arrayList3 = arrayList12;
                    arrayList4 = arrayList13;
                    segmentBase3 = parseSegmentList(xmlPullParser, (SegmentBase.SegmentList) segmentBase3, j, j2, j6, parseAvailabilityTimeOffsetUs, j5);
                    str6 = parseString2;
                } else {
                    j6 = j7;
                    ArrayList arrayList17 = arrayList16;
                    arrayList = arrayList14;
                    arrayList2 = arrayList15;
                    arrayList3 = arrayList12;
                    arrayList4 = arrayList13;
                    if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTemplate")) {
                        parseAvailabilityTimeOffsetUs = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser, j8);
                        str6 = parseString2;
                        segmentBase3 = parseSegmentTemplate(xmlPullParser, (SegmentBase.SegmentTemplate) segmentBase3, list5, j, j2, j6, parseAvailabilityTimeOffsetUs, j5);
                        arrayList9 = arrayList17;
                    } else {
                        str6 = parseString2;
                        if (XmlPullParserUtil.isStartTag(xmlPullParser, "ContentProtection")) {
                            Pair<String, DrmInitData.SchemeData> parseContentProtection = parseContentProtection(xmlPullParser);
                            Object obj = parseContentProtection.first;
                            if (obj != null) {
                                str7 = (String) obj;
                            }
                            Object obj2 = parseContentProtection.second;
                            if (obj2 != null) {
                                arrayList5 = arrayList3;
                                arrayList5.add((DrmInitData.SchemeData) obj2);
                            } else {
                                arrayList5 = arrayList3;
                            }
                            i5 = i6;
                            j7 = j6;
                            arrayList6 = arrayList;
                            arrayList15 = arrayList2;
                            arrayList8 = arrayList17;
                            arrayList13 = arrayList4;
                            arrayList7 = arrayList8;
                            segmentBase2 = segmentBase3;
                            arrayList11 = arrayList7;
                            if (!XmlPullParserUtil.isEndTag(xmlPullParser, "Representation")) {
                            }
                        } else {
                            arrayList5 = arrayList3;
                            if (XmlPullParserUtil.isStartTag(xmlPullParser, "InbandEventStream")) {
                                arrayList13 = arrayList4;
                                arrayList13.add(parseDescriptor(xmlPullParser, "InbandEventStream"));
                                arrayList6 = arrayList;
                            } else {
                                arrayList13 = arrayList4;
                                if (XmlPullParserUtil.isStartTag(xmlPullParser, "EssentialProperty")) {
                                    arrayList6 = arrayList;
                                    arrayList6.add(parseDescriptor(xmlPullParser, "EssentialProperty"));
                                } else {
                                    arrayList6 = arrayList;
                                    if (XmlPullParserUtil.isStartTag(xmlPullParser, "SupplementalProperty")) {
                                        arrayList15 = arrayList2;
                                        arrayList15.add(parseDescriptor(xmlPullParser, "SupplementalProperty"));
                                    } else {
                                        arrayList15 = arrayList2;
                                        maybeSkipTag(xmlPullParser);
                                    }
                                    i5 = i6;
                                    j7 = j6;
                                    arrayList7 = arrayList17;
                                    segmentBase2 = segmentBase3;
                                    arrayList11 = arrayList7;
                                    if (!XmlPullParserUtil.isEndTag(xmlPullParser, "Representation")) {
                                    }
                                }
                            }
                            arrayList15 = arrayList2;
                            i5 = i6;
                            j7 = j6;
                            arrayList7 = arrayList17;
                            segmentBase2 = segmentBase3;
                            arrayList11 = arrayList7;
                            if (!XmlPullParserUtil.isEndTag(xmlPullParser, "Representation")) {
                            }
                        }
                    }
                }
                i5 = i6;
                j8 = parseAvailabilityTimeOffsetUs;
                j7 = j6;
                arrayList6 = arrayList;
                arrayList15 = arrayList2;
                arrayList5 = arrayList3;
                arrayList8 = arrayList9;
                arrayList13 = arrayList4;
                arrayList7 = arrayList8;
                segmentBase2 = segmentBase3;
                arrayList11 = arrayList7;
                if (!XmlPullParserUtil.isEndTag(xmlPullParser, "Representation")) {
                }
            }
            arrayList10 = arrayList16;
            str6 = parseString2;
            i5 = i6;
            segmentBase2 = segmentBase3;
            arrayList5 = arrayList12;
            arrayList6 = arrayList14;
            arrayList11 = arrayList10;
            if (!XmlPullParserUtil.isEndTag(xmlPullParser, "Representation")) {
            }
        }
        ArrayList arrayList18 = arrayList15;
        ArrayList arrayList19 = arrayList6;
        ArrayList arrayList20 = arrayList13;
        ArrayList arrayList21 = arrayList5;
        Format buildFormat = buildFormat(attributeValue, parseString, parseInt2, parseInt3, parseFrameRate, i5, parseInt4, parseInt, str5, list2, list3, str6, parseString3, parseString4, arrayList19, arrayList18);
        if (segmentBase2 == null) {
            segmentBase2 = new SegmentBase.SingleSegmentBase();
        }
        boolean isEmpty = arrayList11.isEmpty();
        List<BaseUrl> list6 = arrayList11;
        if (isEmpty) {
            list6 = list;
        }
        return new RepresentationInfo(buildFormat, list6, segmentBase2, str7, arrayList21, arrayList20, arrayList19, arrayList18, -1L);
    }

    protected Format buildFormat(@Nullable String str, @Nullable String str2, int i, int i2, float f, int i3, int i4, int i5, @Nullable String str3, List<Descriptor> list, List<Descriptor> list2, @Nullable String str4, @Nullable String str5, @Nullable String str6, List<Descriptor> list3, List<Descriptor> list4) {
        String str7 = str5;
        String str8 = str4;
        String sampleMimeType = getSampleMimeType(str2, str8);
        if ("audio/eac3".equals(sampleMimeType)) {
            sampleMimeType = parseEac3SupplementalProperties(list4);
            if ("audio/eac3-joc".equals(sampleMimeType)) {
                str8 = "ec+3";
            }
        }
        if (MimeTypes.isDolbyVisionCodec(str8, str7)) {
            if (str7 == null) {
                str7 = str8;
            }
            sampleMimeType = "video/dolby-vision";
            str8 = str7;
        }
        int parseSelectionFlagsFromRoleDescriptors = parseSelectionFlagsFromRoleDescriptors(list);
        int parseRoleFlagsFromRoleDescriptors = parseRoleFlagsFromRoleDescriptors(list) | parseRoleFlagsFromAccessibilityDescriptors(list2) | parseRoleFlagsFromProperties(list3) | parseRoleFlagsFromProperties(list4);
        Pair<Integer, Integer> parseTileCountFromProperties = parseTileCountFromProperties(list3);
        Format.Builder language = new Format.Builder().setId(str).setContainerMimeType(str2).setSampleMimeType(sampleMimeType).setCodecs(str8).setPeakBitrate(i5).setSelectionFlags(parseSelectionFlagsFromRoleDescriptors).setRoleFlags(parseRoleFlagsFromRoleDescriptors).setLanguage(str3);
        int i6 = -1;
        Format.Builder tileCountVertical = language.setTileCountHorizontal(parseTileCountFromProperties != null ? ((Integer) parseTileCountFromProperties.first).intValue() : -1).setTileCountVertical(parseTileCountFromProperties != null ? ((Integer) parseTileCountFromProperties.second).intValue() : -1);
        if (MimeTypes.isVideo(sampleMimeType)) {
            tileCountVertical.setWidth(i).setHeight(i2).setFrameRate(f);
        } else if (MimeTypes.isAudio(sampleMimeType)) {
            tileCountVertical.setChannelCount(i3).setSampleRate(i4);
        } else if (MimeTypes.isText(sampleMimeType)) {
            if ("application/cea-608".equals(sampleMimeType)) {
                i6 = parseCea608AccessibilityChannel(list2);
            } else if ("application/cea-708".equals(sampleMimeType)) {
                i6 = parseCea708AccessibilityChannel(list2);
            }
            tileCountVertical.setAccessibilityChannel(i6);
        } else if (MimeTypes.isImage(sampleMimeType)) {
            tileCountVertical.setWidth(i).setHeight(i2);
        }
        return tileCountVertical.build();
    }

    protected Representation buildRepresentation(RepresentationInfo representationInfo, @Nullable String str, List<Label> list, @Nullable String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<Descriptor> arrayList2) {
        Format.Builder buildUpon = representationInfo.format.buildUpon();
        if (str != null && list.isEmpty()) {
            buildUpon.setLabel(str);
        } else {
            buildUpon.setLabels(list);
        }
        String str3 = representationInfo.drmSchemeType;
        if (str3 == null) {
            str3 = str2;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = representationInfo.drmSchemeDatas;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            fillInClearKeyInformation(arrayList3);
            filterRedundantIncompleteSchemeDatas(arrayList3);
            buildUpon.setDrmInitData(new DrmInitData(str3, arrayList3));
        }
        ArrayList<Descriptor> arrayList4 = representationInfo.inbandEventStreams;
        arrayList4.addAll(arrayList2);
        return Representation.newInstance(representationInfo.revisionId, buildUpon.build(), representationInfo.baseUrls, representationInfo.segmentBase, arrayList4, representationInfo.essentialProperties, representationInfo.supplementalProperties, null);
    }

    protected SegmentBase.SingleSegmentBase parseSegmentBase(XmlPullParser xmlPullParser, @Nullable SegmentBase.SingleSegmentBase singleSegmentBase) throws XmlPullParserException, IOException {
        long j;
        long j2;
        long parseLong = parseLong(xmlPullParser, "timescale", singleSegmentBase != null ? singleSegmentBase.timescale : 1L);
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", singleSegmentBase != null ? singleSegmentBase.presentationTimeOffset : 0L);
        long j3 = singleSegmentBase != null ? singleSegmentBase.indexStart : 0L;
        long j4 = singleSegmentBase != null ? singleSegmentBase.indexLength : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j2 = Long.parseLong(split[0]);
            j = (Long.parseLong(split[1]) - j2) + 1;
        } else {
            j = j4;
            j2 = j3;
        }
        RangedUri rangedUri = singleSegmentBase != null ? singleSegmentBase.initialization : null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                rangedUri = parseInitialization(xmlPullParser);
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentBase"));
        return buildSingleSegmentBase(rangedUri, parseLong, parseLong2, j2, j);
    }

    protected SegmentBase.SingleSegmentBase buildSingleSegmentBase(RangedUri rangedUri, long j, long j2, long j3, long j4) {
        return new SegmentBase.SingleSegmentBase(rangedUri, j, j2, j3, j4);
    }

    protected SegmentBase.SegmentList parseSegmentList(XmlPullParser xmlPullParser, @Nullable SegmentBase.SegmentList segmentList, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long parseLong = parseLong(xmlPullParser, "timescale", segmentList != null ? segmentList.timescale : 1L);
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", segmentList != null ? segmentList.presentationTimeOffset : 0L);
        long parseLong3 = parseLong(xmlPullParser, IronSourceConstants.EVENTS_DURATION, segmentList != null ? segmentList.duration : -9223372036854775807L);
        long parseLong4 = parseLong(xmlPullParser, "startNumber", segmentList != null ? segmentList.startNumber : 1L);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j3, j4);
        List<SegmentBase.SegmentTimelineElement> list = null;
        List<RangedUri> list2 = null;
        RangedUri rangedUri = null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                rangedUri = parseInitialization(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTimeline")) {
                list = parseSegmentTimeline(xmlPullParser, parseLong, j2);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList<>();
                }
                list2.add(parseSegmentUrl(xmlPullParser));
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentList"));
        if (segmentList != null) {
            if (rangedUri == null) {
                rangedUri = segmentList.initialization;
            }
            if (list == null) {
                list = segmentList.segmentTimeline;
            }
            if (list2 == null) {
                list2 = segmentList.mediaSegments;
            }
        }
        return buildSegmentList(rangedUri, parseLong, parseLong2, parseLong4, parseLong3, list, finalAvailabilityTimeOffset, list2, j5, j);
    }

    protected SegmentBase.SegmentList buildSegmentList(RangedUri rangedUri, long j, long j2, long j3, long j4, @Nullable List<SegmentBase.SegmentTimelineElement> list, long j5, @Nullable List<RangedUri> list2, long j6, long j7) {
        return new SegmentBase.SegmentList(rangedUri, j, j2, j3, j4, list, j5, list2, Util.msToUs(j6), Util.msToUs(j7));
    }

    protected SegmentBase.SegmentTemplate parseSegmentTemplate(XmlPullParser xmlPullParser, @Nullable SegmentBase.SegmentTemplate segmentTemplate, List<Descriptor> list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long parseLong = parseLong(xmlPullParser, "timescale", segmentTemplate != null ? segmentTemplate.timescale : 1L);
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", segmentTemplate != null ? segmentTemplate.presentationTimeOffset : 0L);
        long parseLong3 = parseLong(xmlPullParser, IronSourceConstants.EVENTS_DURATION, segmentTemplate != null ? segmentTemplate.duration : -9223372036854775807L);
        long parseLong4 = parseLong(xmlPullParser, "startNumber", segmentTemplate != null ? segmentTemplate.startNumber : 1L);
        long parseLastSegmentNumberSupplementalProperty = parseLastSegmentNumberSupplementalProperty(list);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j3, j4);
        List<SegmentBase.SegmentTimelineElement> list2 = null;
        UrlTemplate parseUrlTemplate = parseUrlTemplate(xmlPullParser, "media", segmentTemplate != null ? segmentTemplate.mediaTemplate : null);
        UrlTemplate parseUrlTemplate2 = parseUrlTemplate(xmlPullParser, GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION, segmentTemplate != null ? segmentTemplate.initializationTemplate : null);
        RangedUri rangedUri = null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                rangedUri = parseInitialization(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTimeline")) {
                list2 = parseSegmentTimeline(xmlPullParser, parseLong, j2);
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTemplate"));
        if (segmentTemplate != null) {
            if (rangedUri == null) {
                rangedUri = segmentTemplate.initialization;
            }
            if (list2 == null) {
                list2 = segmentTemplate.segmentTimeline;
            }
        }
        return buildSegmentTemplate(rangedUri, parseLong, parseLong2, parseLong4, parseLastSegmentNumberSupplementalProperty, parseLong3, list2, finalAvailabilityTimeOffset, parseUrlTemplate2, parseUrlTemplate, j5, j);
    }

    protected SegmentBase.SegmentTemplate buildSegmentTemplate(RangedUri rangedUri, long j, long j2, long j3, long j4, long j5, List<SegmentBase.SegmentTimelineElement> list, long j6, @Nullable UrlTemplate urlTemplate, @Nullable UrlTemplate urlTemplate2, long j7, long j8) {
        return new SegmentBase.SegmentTemplate(rangedUri, j, j2, j3, j4, j5, list, j6, urlTemplate, urlTemplate2, Util.msToUs(j7), Util.msToUs(j8));
    }

    protected EventStream parseEventStream(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        long j;
        ArrayList arrayList;
        String parseString = parseString(xmlPullParser, "schemeIdUri", "");
        String parseString2 = parseString(xmlPullParser, "value", "");
        long parseLong = parseLong(xmlPullParser, "timescale", 1L);
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList2 = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Event")) {
                byteArrayOutputStream = byteArrayOutputStream2;
                long j2 = parseLong2;
                j = parseLong2;
                arrayList = arrayList2;
                arrayList.add(parseEvent(xmlPullParser, parseString, parseString2, parseLong, j2, byteArrayOutputStream));
            } else {
                byteArrayOutputStream = byteArrayOutputStream2;
                j = parseLong2;
                arrayList = arrayList2;
                maybeSkipTag(xmlPullParser);
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "EventStream")) {
                break;
            }
            arrayList2 = arrayList;
            byteArrayOutputStream2 = byteArrayOutputStream;
            parseLong2 = j;
        }
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            eventMessageArr[i] = (EventMessage) pair.second;
        }
        return buildEventStream(parseString, parseString2, parseLong, jArr, eventMessageArr);
    }

    protected EventStream buildEventStream(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        return new EventStream(str, str2, j, jArr, eventMessageArr);
    }

    protected Pair<Long, EventMessage> parseEvent(XmlPullParser xmlPullParser, String str, String str2, long j, long j2, ByteArrayOutputStream byteArrayOutputStream) throws IOException, XmlPullParserException {
        long parseLong = parseLong(xmlPullParser, "id", 0L);
        long parseLong2 = parseLong(xmlPullParser, IronSourceConstants.EVENTS_DURATION, -9223372036854775807L);
        long parseLong3 = parseLong(xmlPullParser, "presentationTime", 0L);
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(parseLong2, 1000L, j);
        long scaleLargeTimestamp2 = Util.scaleLargeTimestamp(parseLong3 - j2, 1000000L, j);
        String parseString = parseString(xmlPullParser, "messageData", null);
        byte[] parseEventObject = parseEventObject(xmlPullParser, byteArrayOutputStream);
        Long valueOf = Long.valueOf(scaleLargeTimestamp2);
        if (parseString != null) {
            parseEventObject = Util.getUtf8Bytes(parseString);
        }
        return Pair.create(valueOf, buildEvent(str, str2, parseLong, scaleLargeTimestamp, parseEventObject));
    }

    protected byte[] parseEventObject(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, StandardCharsets.UTF_8.name());
        xmlPullParser.nextToken();
        while (!XmlPullParserUtil.isEndTag(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    protected EventMessage buildEvent(String str, String str2, long j, long j2, byte[] bArr) {
        return new EventMessage(str, str2, j2, j, bArr);
    }

    protected List<SegmentBase.SegmentTimelineElement> parseSegmentTimeline(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        long j4 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "S")) {
                long parseLong = parseLong(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    j3 = addSegmentTimelineElementsToList(arrayList, j3, j4, i, parseLong);
                }
                if (parseLong == -9223372036854775807L) {
                    parseLong = j3;
                }
                j4 = parseLong(xmlPullParser, "d", -9223372036854775807L);
                i = parseInt(xmlPullParser, "r", 0);
                z = true;
                j3 = parseLong;
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTimeline"));
        if (z) {
            addSegmentTimelineElementsToList(arrayList, j3, j4, i, Util.scaleLargeTimestamp(j2, j, 1000L));
        }
        return arrayList;
    }

    private long addSegmentTimelineElementsToList(List<SegmentBase.SegmentTimelineElement> list, long j, long j2, int i, long j3) {
        int ceilDivide = i >= 0 ? i + 1 : (int) Util.ceilDivide(j3 - j, j2);
        for (int i2 = 0; i2 < ceilDivide; i2++) {
            list.add(buildSegmentTimelineElement(j, j2));
            j += j2;
        }
        return j;
    }

    protected SegmentBase.SegmentTimelineElement buildSegmentTimelineElement(long j, long j2) {
        return new SegmentBase.SegmentTimelineElement(j, j2);
    }

    @Nullable
    protected UrlTemplate parseUrlTemplate(XmlPullParser xmlPullParser, String str, @Nullable UrlTemplate urlTemplate) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? UrlTemplate.compile(attributeValue) : urlTemplate;
    }

    protected RangedUri parseInitialization(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "sourceURL", "range");
    }

    protected RangedUri parseSegmentUrl(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "media", "mediaRange");
    }

    protected RangedUri parseRangedUrl(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
                return buildRangedUri(attributeValue, j, j2);
            }
        } else {
            j = 0;
        }
        j2 = -1;
        return buildRangedUri(attributeValue, j, j2);
    }

    protected RangedUri buildRangedUri(String str, long j, long j2) {
        return new RangedUri(str, j, j2);
    }

    protected ProgramInformation parseProgramInformation(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str = null;
        String parseString = parseString(xmlPullParser, "moreInformationURL", null);
        String parseString2 = parseString(xmlPullParser, O6.q, null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
            String str4 = str3;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "ProgramInformation")) {
                return new ProgramInformation(str, str2, str4, parseString, parseString2);
            }
            str3 = str4;
        }
    }

    protected Label parseLabel(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return new Label(xmlPullParser.getAttributeValue(null, O6.q), parseText(xmlPullParser, "Label"));
    }

    protected List<BaseUrl> parseBaseUrl(XmlPullParser xmlPullParser, List<BaseUrl> list, boolean z) throws XmlPullParserException, IOException {
        int i;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else {
            i = z ? 1 : Integer.MIN_VALUE;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String parseText = parseText(xmlPullParser, "BaseURL");
        if (UriUtil.isAbsolute(parseText)) {
            if (attributeValue3 == null) {
                attributeValue3 = parseText;
            }
            return Lists.newArrayList(new BaseUrl(parseText, attributeValue3, i, parseInt));
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            BaseUrl baseUrl = list.get(i2);
            String resolve = UriUtil.resolve(baseUrl.url, parseText);
            String str = attributeValue3 == null ? resolve : attributeValue3;
            if (z) {
                i = baseUrl.priority;
                parseInt = baseUrl.weight;
                str = baseUrl.serviceLocation;
            }
            arrayList.add(new BaseUrl(resolve, str, i, parseInt));
        }
        return arrayList;
    }

    protected long parseAvailabilityTimeOffsetUs(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected int parseAudioChannelConfiguration(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        char c;
        String parseString = parseString(xmlPullParser, "schemeIdUri", null);
        parseString.hashCode();
        int i = -1;
        switch (parseString.hashCode()) {
            case -2128649360:
                if (parseString.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2060825028:
                if (parseString.equals("tag:dolby.com,2015:dash:audio_channel_configuration:2015")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1352850286:
                if (parseString.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1138141449:
                if (parseString.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -986633423:
                if (parseString.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -79006963:
                if (parseString.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 312179081:
                if (parseString.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 2036691300:
                if (parseString.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c = 7;
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
            case 5:
                i = parseDtsChannelConfiguration(xmlPullParser);
                break;
            case 1:
                i = parseDolbyAC4ChannelConfiguration(xmlPullParser, str);
                break;
            case 2:
                i = parseInt(xmlPullParser, "value", -1);
                break;
            case 3:
            case 7:
                i = parseDolbyChannelConfiguration(xmlPullParser);
                break;
            case 4:
                i = parseMpegChannelConfiguration(xmlPullParser);
                break;
            case 6:
                i = parseDtsxChannelConfiguration(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "AudioChannelConfiguration"));
        return i;
    }

    protected int parseSelectionFlagsFromRoleDescriptors(List<Descriptor> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Descriptor descriptor = list.get(i2);
            if (Ascii.equalsIgnoreCase("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                i |= parseSelectionFlagsFromDashRoleScheme(descriptor.value);
            }
        }
        return i;
    }

    protected int parseSelectionFlagsFromDashRoleScheme(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    protected int parseRoleFlagsFromRoleDescriptors(List<Descriptor> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Descriptor descriptor = list.get(i2);
            if (Ascii.equalsIgnoreCase("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                i |= parseRoleFlagsFromDashRoleScheme(descriptor.value);
            }
        }
        return i;
    }

    protected int parseRoleFlagsFromAccessibilityDescriptors(List<Descriptor> list) {
        int parseTvaAudioPurposeCsValue;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Descriptor descriptor = list.get(i2);
            if (Ascii.equalsIgnoreCase("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                parseTvaAudioPurposeCsValue = parseRoleFlagsFromDashRoleScheme(descriptor.value);
            } else if (Ascii.equalsIgnoreCase("urn:tva:metadata:cs:AudioPurposeCS:2007", descriptor.schemeIdUri)) {
                parseTvaAudioPurposeCsValue = parseTvaAudioPurposeCsValue(descriptor.value);
            }
            i |= parseTvaAudioPurposeCsValue;
        }
        return i;
    }

    protected int parseRoleFlagsFromProperties(List<Descriptor> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (Ascii.equalsIgnoreCase("http://dashif.org/guidelines/trickmode", list.get(i2).schemeIdUri)) {
                i = 16384;
            }
        }
        return i;
    }

    protected int parseRoleFlagsFromDashRoleScheme(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    protected int parseTvaAudioPurposeCsValue(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    protected String[] parseProfiles(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(StringUtils.COMMA);
    }

    @Nullable
    protected Pair<Integer, Integer> parseTileCountFromProperties(List<Descriptor> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if ((Ascii.equalsIgnoreCase("http://dashif.org/thumbnail_tile", descriptor.schemeIdUri) || Ascii.equalsIgnoreCase("http://dashif.org/guidelines/thumbnail_tile", descriptor.schemeIdUri)) && (str = descriptor.value) != null) {
                String[] split = Util.split(str, VastAttributes.HORIZONTAL_POSITION);
                if (split.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public static void maybeSkipTag(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (XmlPullParserUtil.isStartTag(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (XmlPullParserUtil.isStartTag(xmlPullParser)) {
                    i++;
                } else if (XmlPullParserUtil.isEndTag(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    private static void filterRedundantIncompleteSchemeDatas(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.hasData()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    }
                    if (arrayList.get(i).canReplace(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                    i++;
                }
            }
        }
    }

    private static void fillInClearKeyInformation(ArrayList<DrmInitData.SchemeData> arrayList) {
        String str;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                str = null;
                break;
            }
            DrmInitData.SchemeData schemeData = arrayList.get(i);
            if (C.CLEARKEY_UUID.equals(schemeData.uuid) && (str = schemeData.licenseServerUrl) != null) {
                arrayList.remove(i);
                break;
            }
            i++;
        }
        if (str == null) {
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            DrmInitData.SchemeData schemeData2 = arrayList.get(i2);
            if (C.COMMON_PSSH_UUID.equals(schemeData2.uuid) && schemeData2.licenseServerUrl == null) {
                arrayList.set(i2, new DrmInitData.SchemeData(C.CLEARKEY_UUID, str, schemeData2.mimeType, schemeData2.data));
            }
        }
    }

    @Nullable
    private static String getSampleMimeType(@Nullable String str, @Nullable String str2) {
        if (MimeTypes.isAudio(str)) {
            return MimeTypes.getAudioMediaMimeType(str2);
        }
        if (MimeTypes.isVideo(str)) {
            return MimeTypes.getVideoMediaMimeType(str2);
        }
        if (MimeTypes.isText(str) || MimeTypes.isImage(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String mediaMimeType = MimeTypes.getMediaMimeType(str2);
        return "text/vtt".equals(mediaMimeType) ? "application/x-mp4-vtt" : mediaMimeType;
    }

    @Nullable
    private static String checkLanguageConsistency(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        Assertions.checkState(str.equals(str2));
        return str;
    }

    private static int checkContentTypeConsistency(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        Assertions.checkState(i == i2);
        return i;
    }

    protected static Descriptor parseDescriptor(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String parseString = parseString(xmlPullParser, "schemeIdUri", "");
        String parseString2 = parseString(xmlPullParser, "value", null);
        String parseString3 = parseString(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str));
        return new Descriptor(parseString, parseString2, parseString3);
    }

    protected static int parseCea608AccessibilityChannel(List<Descriptor> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri) && (str = descriptor.value) != null) {
                Matcher matcher = CEA_608_ACCESSIBILITY_PATTERN.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                Log.w(TAG, "Unable to parse CEA-608 channel number from: " + descriptor.value);
            }
        }
        return -1;
    }

    protected static int parseCea708AccessibilityChannel(List<Descriptor> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(descriptor.schemeIdUri) && (str = descriptor.value) != null) {
                Matcher matcher = CEA_708_ACCESSIBILITY_PATTERN.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                Log.w(TAG, "Unable to parse CEA-708 service block number from: " + descriptor.value);
            }
        }
        return -1;
    }

    protected static String parseEac3SupplementalProperties(List<Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            String str = descriptor.schemeIdUri;
            if (!"tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) || !"JOC".equals(descriptor.value)) {
                if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(descriptor.value)) {
                    return "audio/eac3-joc";
                }
            } else {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    protected static float parseFrameRate(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = FRAME_RATE_PATTERN.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
    }

    protected static long parseDuration(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Util.parseXsDuration(attributeValue);
    }

    protected static long parseDateTime(XmlPullParser xmlPullParser, String str, long j) throws ParserException {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Util.parseXsDateTime(attributeValue);
    }

    protected static String parseText(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str));
        return str2;
    }

    protected static int parseInt(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    protected static long parseLong(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    protected static float parseFloat(XmlPullParser xmlPullParser, String str, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f : Float.parseFloat(attributeValue);
    }

    protected static String parseString(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    protected static int parseMpegChannelConfiguration(XmlPullParser xmlPullParser) {
        int parseInt = parseInt(xmlPullParser, "value", -1);
        if (parseInt < 0) {
            return -1;
        }
        int[] iArr = MPEG_CHANNEL_CONFIGURATION_MAPPING;
        if (parseInt < iArr.length) {
            return iArr[parseInt];
        }
        return -1;
    }

    protected static int parseDtsChannelConfiguration(XmlPullParser xmlPullParser) {
        int parseInt = parseInt(xmlPullParser, "value", -1);
        if (parseInt <= 0 || parseInt >= 33) {
            return -1;
        }
        return parseInt;
    }

    protected static int parseDtsxChannelConfiguration(XmlPullParser xmlPullParser) {
        int bitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (bitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return bitCount;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected static int parseDolbyChannelConfiguration(XmlPullParser xmlPullParser) {
        char c;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String lowerCase = Ascii.toLowerCase(attributeValue);
        lowerCase.hashCode();
        switch (lowerCase.hashCode()) {
            case 1596796:
                if (lowerCase.equals("4000")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2937391:
                if (lowerCase.equals("a000")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3094034:
                if (lowerCase.equals("f800")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3094035:
                if (lowerCase.equals("f801")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3133436:
                if (lowerCase.equals("fa01")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
        }
        return -1;
    }

    protected static int parseDolbyAC4ChannelConfiguration(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || attributeValue.length() != 6) {
            return -1;
        }
        int parseInt = Integer.parseInt(attributeValue, 16);
        if ((8388608 & parseInt) != 0) {
            return parseDolbyAc4ObjectBasedChannelConfiguration(str);
        }
        return parseDolbyAc4ChannelBasedChannelConfiguration(parseInt);
    }

    private static int parseDolbyAc4ObjectBasedChannelConfiguration(String str) {
        String[] splitCodecs = Util.splitCodecs(str);
        if (splitCodecs.length == 0) {
            return -1;
        }
        List splitToList = Splitter.on('.').splitToList(Ascii.toLowerCase(splitCodecs[0].trim()));
        if (splitToList.size() != 4 || !((String) splitToList.get(0)).equals("ac-4")) {
            return -1;
        }
        String str2 = (String) splitToList.get(3);
        str2.hashCode();
        if (str2.equals("03")) {
            return 18;
        }
        return !str2.equals("04") ? -1 : 21;
    }

    private static int parseDolbyAc4ChannelBasedChannelConfiguration(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = DOLBY_AC4_CHANNEL_CONFIGURATION_MAPPING;
            if (i2 >= iArr.length) {
                break;
            }
            i3 += ((i >> i2) & 1) * iArr[i2];
            i2++;
        }
        if (i3 == 0) {
            return -1;
        }
        return i3;
    }

    protected static long parseLastSegmentNumberSupplementalProperty(List<Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if (Ascii.equalsIgnoreCase("http://dashif.org/guidelines/last-segment-number", descriptor.schemeIdUri)) {
                return Long.parseLong(descriptor.value);
            }
        }
        return -1L;
    }

    private boolean isDvbProfileDeclared(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    protected static final class RepresentationInfo {
        public final ImmutableList<BaseUrl> baseUrls;
        public final ArrayList<DrmInitData.SchemeData> drmSchemeDatas;

        @Nullable
        public final String drmSchemeType;
        public final List<Descriptor> essentialProperties;
        public final Format format;
        public final ArrayList<Descriptor> inbandEventStreams;
        public final long revisionId;
        public final SegmentBase segmentBase;
        public final List<Descriptor> supplementalProperties;

        public RepresentationInfo(Format format, List<BaseUrl> list, SegmentBase segmentBase, @Nullable String str, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<Descriptor> arrayList2, List<Descriptor> list2, List<Descriptor> list3, long j) {
            this.format = format;
            this.baseUrls = ImmutableList.copyOf((Collection) list);
            this.segmentBase = segmentBase;
            this.drmSchemeType = str;
            this.drmSchemeDatas = arrayList;
            this.inbandEventStreams = arrayList2;
            this.essentialProperties = list2;
            this.supplementalProperties = list3;
            this.revisionId = j;
        }
    }
}
