package org.bouncycastle.x509;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import kotlin.UByte;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x509.AccessDescription;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AuthorityInformationAccess;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.NameConstraints;
import org.bouncycastle.asn1.x509.PolicyInformation;
import org.bouncycastle.asn1.x509.qualified.MonetaryValue;
import org.bouncycastle.asn1.x509.qualified.QCStatement;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.LocaleString;
import org.bouncycastle.i18n.filter.TrustedInput;
import org.bouncycastle.i18n.filter.UntrustedInput;
import org.bouncycastle.i18n.filter.UntrustedUrlInput;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidator;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException;
import org.bouncycastle.jce.provider.PKIXPolicyNode;
import org.bouncycastle.jce.provider.RFC3280CertPathUtilities;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Objects;

/* loaded from: classes3.dex */
public class PKIXCertPathReviewer extends CertPathValidatorUtilities {
    private static final String RESOURCE_NAME = "org.bouncycastle.x509.CertPathReviewerMessages";
    protected CertPath certPath;
    protected List certs;
    protected Date currentDate;
    protected List[] errors;
    private boolean initialized;
    protected int n;
    protected List[] notifications;
    protected PKIXParameters pkixParams;
    protected PolicyNode policyTree;
    protected PublicKey subjectPublicKey;
    protected TrustAnchor trustAnchor;
    protected Date validDate;
    private static final String QC_STATEMENT = Extension.qCStatements.getId();
    private static final String CRL_DIST_POINTS = Extension.cRLDistributionPoints.getId();
    private static final String AUTH_INFO_ACCESS = Extension.authorityInfoAccess.getId();

    public PKIXCertPathReviewer() {
    }

    public PKIXCertPathReviewer(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        init(certPath, pKIXParameters);
    }

    private String IPtoString(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr).getHostAddress();
        } catch (Exception unused) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i != bArr.length; i++) {
                stringBuffer.append(Integer.toHexString(bArr[i] & UByte.MAX_VALUE));
                stringBuffer.append(' ');
            }
            return stringBuffer.toString();
        }
    }

    private void checkCriticalExtensions() {
        List<PKIXCertPathChecker> certPathCheckers = this.pkixParams.getCertPathCheckers();
        Iterator<PKIXCertPathChecker> it = certPathCheckers.iterator();
        while (it.hasNext()) {
            try {
                try {
                    it.next().init(false);
                } catch (CertPathValidatorException e) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certPathCheckerError", new Object[]{e.getMessage(), e, e.getClass().getName()}), e);
                }
            } catch (CertPathReviewerException e2) {
                addError(e2.getErrorMessage(), e2.getIndex());
                return;
            }
        }
        for (int size = this.certs.size() - 1; size >= 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty()) {
                criticalExtensionOIDs.remove(KEY_USAGE);
                criticalExtensionOIDs.remove(CERTIFICATE_POLICIES);
                criticalExtensionOIDs.remove(POLICY_MAPPINGS);
                criticalExtensionOIDs.remove(INHIBIT_ANY_POLICY);
                criticalExtensionOIDs.remove(ISSUING_DISTRIBUTION_POINT);
                criticalExtensionOIDs.remove(DELTA_CRL_INDICATOR);
                criticalExtensionOIDs.remove(POLICY_CONSTRAINTS);
                criticalExtensionOIDs.remove(BASIC_CONSTRAINTS);
                criticalExtensionOIDs.remove(SUBJECT_ALTERNATIVE_NAME);
                criticalExtensionOIDs.remove(NAME_CONSTRAINTS);
                if (size == 0) {
                    criticalExtensionOIDs.remove(Extension.extendedKeyUsage.getId());
                }
                String str = QC_STATEMENT;
                if (criticalExtensionOIDs.contains(str) && processQcStatements(x509Certificate, size)) {
                    criticalExtensionOIDs.remove(str);
                }
                Iterator<PKIXCertPathChecker> it2 = certPathCheckers.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().check(x509Certificate, criticalExtensionOIDs);
                    } catch (CertPathValidatorException e3) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.criticalExtensionError", new Object[]{e3.getMessage(), e3, e3.getClass().getName()}), e3.getCause(), this.certPath, size);
                    }
                }
                if (!criticalExtensionOIDs.isEmpty()) {
                    Iterator<String> it3 = criticalExtensionOIDs.iterator();
                    while (it3.hasNext()) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.unknownCriticalExt", new Object[]{new ASN1ObjectIdentifier(it3.next())}), size);
                    }
                }
            }
        }
    }

    private void checkNameConstraints() {
        PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
        try {
            for (int size = this.certs.size() - 1; size > 0; size--) {
                X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
                if (!isSelfIssued(x509Certificate)) {
                    X500Principal subjectPrincipal = getSubjectPrincipal(x509Certificate);
                    try {
                        ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream(new ByteArrayInputStream(subjectPrincipal.getEncoded())).readObject();
                        try {
                            pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence);
                            try {
                                pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence);
                                try {
                                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) getExtensionValue(x509Certificate, SUBJECT_ALTERNATIVE_NAME);
                                    if (aSN1Sequence2 != null) {
                                        for (int i = 0; i < aSN1Sequence2.size(); i++) {
                                            GeneralName generalName = GeneralName.getInstance(aSN1Sequence2.getObjectAt(i));
                                            try {
                                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                                pKIXNameConstraintValidator.checkExcluded(generalName);
                                            } catch (PKIXNameConstraintValidatorException e) {
                                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notPermittedEmail", new Object[]{new UntrustedInput(generalName)}), e, this.certPath, size);
                                            }
                                        }
                                    }
                                } catch (AnnotatedException e2) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.subjAltNameExtError"), e2, this.certPath, size);
                                }
                            } catch (PKIXNameConstraintValidatorException e3) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.excludedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e3, this.certPath, size);
                            }
                        } catch (PKIXNameConstraintValidatorException e4) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notPermittedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e4, this.certPath, size);
                        }
                    } catch (IOException e5) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ncSubjectNameError", new Object[]{new UntrustedInput(subjectPrincipal)}), e5, this.certPath, size);
                    }
                }
                try {
                    ASN1Sequence aSN1Sequence3 = (ASN1Sequence) getExtensionValue(x509Certificate, NAME_CONSTRAINTS);
                    if (aSN1Sequence3 != null) {
                        NameConstraints nameConstraints = NameConstraints.getInstance(aSN1Sequence3);
                        GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
                        if (permittedSubtrees != null) {
                            pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                        }
                        GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
                        if (excludedSubtrees != null) {
                            for (int i2 = 0; i2 != excludedSubtrees.length; i2++) {
                                pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i2]);
                            }
                        }
                    }
                } catch (AnnotatedException e6) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ncExtError"), e6, this.certPath, size);
                }
            }
        } catch (CertPathReviewerException e7) {
            addError(e7.getErrorMessage(), e7.getIndex());
        }
    }

    private void checkPathLength() {
        BasicConstraints basicConstraints;
        ASN1Integer pathLenConstraintInteger;
        int i = this.n;
        int i2 = 0;
        for (int size = this.certs.size() - 1; size > 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            if (!isSelfIssued(x509Certificate)) {
                if (i <= 0) {
                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.pathLengthExtended"));
                }
                i--;
                i2++;
            }
            try {
                basicConstraints = BasicConstraints.getInstance(getExtensionValue(x509Certificate, BASIC_CONSTRAINTS));
            } catch (AnnotatedException unused) {
                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.processLengthConstError"), size);
                basicConstraints = null;
            }
            if (basicConstraints != null && basicConstraints.isCA() && (pathLenConstraintInteger = basicConstraints.getPathLenConstraintInteger()) != null) {
                i = Math.min(i, pathLenConstraintInteger.intPositiveValueExact());
            }
        }
        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.totalPathLength", new Object[]{Integers.valueOf(i2)}));
    }

    /* JADX WARN: Code restructure failed: missing block: B:230:0x0144, code lost:
    
        r22 = getQualifierSet(r10.getPolicyQualifiers());
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x014e, code lost:
    
        r9 = r5[r14 - 1];
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0155, code lost:
    
        if (r10 >= r9.size()) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0157, code lost:
    
        r21 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r9.get(r10);
        r11 = r21.getExpectedPolicies().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x016b, code lost:
    
        if (r11.hasNext() == false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x016d, code lost:
    
        r30 = r9;
        r9 = r11.next();
        r31 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0177, code lost:
    
        if ((r9 instanceof java.lang.String) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0179, code lost:
    
        r9 = (java.lang.String) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0186, code lost:
    
        r10 = r21.getChildren();
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0190, code lost:
    
        if (r10.hasNext() == false) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0192, code lost:
    
        r19 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x01a2, code lost:
    
        if (r9.equals(((org.bouncycastle.jce.provider.PKIXPolicyNode) r10.next()).getValidPolicy()) == false) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x01a4, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x01a6, code lost:
    
        r10 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01a9, code lost:
    
        if (r17 != false) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x01ab, code lost:
    
        r10 = new java.util.HashSet();
        r10.add(r9);
        r17 = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), r14, r10, r21, r22, r9, false);
        r9 = r21;
        r9.addChild(r17);
        r21 = r9;
        r5[r14].add(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01d3, code lost:
    
        r9 = r30;
        r10 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x017e, code lost:
    
        if ((r9 instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) == false) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0180, code lost:
    
        r9 = ((org.bouncycastle.asn1.ASN1ObjectIdentifier) r9).getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x01d8, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:227:0x012e A[Catch: CertPathReviewerException -> 0x05e3, TRY_LEAVE, TryCatch #6 {CertPathReviewerException -> 0x05e3, blocks: (B:15:0x0068, B:19:0x0077, B:22:0x0084, B:26:0x0094, B:27:0x009f, B:29:0x00a5, B:32:0x00c6, B:33:0x00ce, B:35:0x00d4, B:41:0x00d9, B:42:0x00e5, B:48:0x00f1, B:51:0x00f8, B:52:0x0101, B:54:0x0107, B:57:0x0111, B:64:0x011a, B:66:0x011e, B:68:0x01ee, B:70:0x01f2, B:71:0x01fb, B:73:0x0201, B:75:0x020d, B:82:0x0214, B:80:0x0217, B:86:0x021e, B:88:0x0226, B:89:0x022f, B:91:0x0235, B:100:0x0253, B:101:0x025f, B:102:0x0260, B:108:0x0264, B:110:0x026c, B:111:0x0272, B:113:0x0278, B:116:0x029c, B:118:0x02a6, B:120:0x02ab, B:121:0x02b7, B:123:0x02b8, B:124:0x02c4, B:127:0x02c9, B:128:0x02dc, B:130:0x02e2, B:132:0x0308, B:134:0x0320, B:135:0x0317, B:138:0x0325, B:139:0x032b, B:141:0x0331, B:144:0x0339, B:157:0x035b, B:149:0x033e, B:150:0x034a, B:152:0x034c, B:153:0x0358, B:162:0x0367, B:171:0x0389, B:173:0x0393, B:174:0x0397, B:176:0x039d, B:190:0x03ad, B:179:0x03ba, B:200:0x03c7, B:202:0x03d1, B:106:0x040f, B:209:0x03d9, B:210:0x03e7, B:212:0x03e8, B:213:0x03f4, B:222:0x03f6, B:223:0x0404, B:224:0x0124, B:225:0x0128, B:227:0x012e, B:230:0x0144, B:232:0x014e, B:233:0x0151, B:235:0x0157, B:236:0x0167, B:238:0x016d, B:240:0x0179, B:241:0x0186, B:242:0x018c, B:244:0x0192, B:252:0x01ab, B:256:0x017c, B:258:0x0180, B:261:0x01d8, B:265:0x01e1, B:266:0x01ed, B:273:0x041d, B:274:0x0429, B:276:0x042a, B:281:0x043d, B:283:0x0447, B:284:0x044c, B:286:0x0452, B:289:0x0460, B:304:0x0473, B:311:0x05c8, B:312:0x05d4, B:314:0x047e, B:315:0x048a, B:316:0x048b, B:318:0x0491, B:320:0x0499, B:322:0x049f, B:324:0x04a7, B:325:0x04aa, B:327:0x04b0, B:329:0x04c0, B:330:0x04c4, B:332:0x04ca, B:334:0x04d2, B:337:0x04d5, B:339:0x04d8, B:340:0x04dc, B:342:0x04e2, B:345:0x04f2, B:347:0x04fc, B:348:0x04ff, B:350:0x0505, B:352:0x0511, B:354:0x0515, B:357:0x0518, B:360:0x051e, B:361:0x052a, B:363:0x052f, B:365:0x0537, B:366:0x053a, B:368:0x0540, B:370:0x0550, B:371:0x0554, B:373:0x055a, B:376:0x056a, B:381:0x056e, B:384:0x0571, B:386:0x0574, B:387:0x057a, B:389:0x0580, B:391:0x0592, B:397:0x059c, B:399:0x05a4, B:400:0x05a7, B:402:0x05ad, B:404:0x05b9, B:406:0x05bd, B:409:0x05c0, B:411:0x05d6, B:412:0x05e2), top: B:14:0x0068, inners: #2, #3, #4, #5, #7, #8, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x01ee A[EDGE_INSN: B:268:0x01ee->B:68:0x01ee BREAK  A[LOOP:11: B:225:0x0128->B:267:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f2 A[Catch: CertPathReviewerException -> 0x05e3, TryCatch #6 {CertPathReviewerException -> 0x05e3, blocks: (B:15:0x0068, B:19:0x0077, B:22:0x0084, B:26:0x0094, B:27:0x009f, B:29:0x00a5, B:32:0x00c6, B:33:0x00ce, B:35:0x00d4, B:41:0x00d9, B:42:0x00e5, B:48:0x00f1, B:51:0x00f8, B:52:0x0101, B:54:0x0107, B:57:0x0111, B:64:0x011a, B:66:0x011e, B:68:0x01ee, B:70:0x01f2, B:71:0x01fb, B:73:0x0201, B:75:0x020d, B:82:0x0214, B:80:0x0217, B:86:0x021e, B:88:0x0226, B:89:0x022f, B:91:0x0235, B:100:0x0253, B:101:0x025f, B:102:0x0260, B:108:0x0264, B:110:0x026c, B:111:0x0272, B:113:0x0278, B:116:0x029c, B:118:0x02a6, B:120:0x02ab, B:121:0x02b7, B:123:0x02b8, B:124:0x02c4, B:127:0x02c9, B:128:0x02dc, B:130:0x02e2, B:132:0x0308, B:134:0x0320, B:135:0x0317, B:138:0x0325, B:139:0x032b, B:141:0x0331, B:144:0x0339, B:157:0x035b, B:149:0x033e, B:150:0x034a, B:152:0x034c, B:153:0x0358, B:162:0x0367, B:171:0x0389, B:173:0x0393, B:174:0x0397, B:176:0x039d, B:190:0x03ad, B:179:0x03ba, B:200:0x03c7, B:202:0x03d1, B:106:0x040f, B:209:0x03d9, B:210:0x03e7, B:212:0x03e8, B:213:0x03f4, B:222:0x03f6, B:223:0x0404, B:224:0x0124, B:225:0x0128, B:227:0x012e, B:230:0x0144, B:232:0x014e, B:233:0x0151, B:235:0x0157, B:236:0x0167, B:238:0x016d, B:240:0x0179, B:241:0x0186, B:242:0x018c, B:244:0x0192, B:252:0x01ab, B:256:0x017c, B:258:0x0180, B:261:0x01d8, B:265:0x01e1, B:266:0x01ed, B:273:0x041d, B:274:0x0429, B:276:0x042a, B:281:0x043d, B:283:0x0447, B:284:0x044c, B:286:0x0452, B:289:0x0460, B:304:0x0473, B:311:0x05c8, B:312:0x05d4, B:314:0x047e, B:315:0x048a, B:316:0x048b, B:318:0x0491, B:320:0x0499, B:322:0x049f, B:324:0x04a7, B:325:0x04aa, B:327:0x04b0, B:329:0x04c0, B:330:0x04c4, B:332:0x04ca, B:334:0x04d2, B:337:0x04d5, B:339:0x04d8, B:340:0x04dc, B:342:0x04e2, B:345:0x04f2, B:347:0x04fc, B:348:0x04ff, B:350:0x0505, B:352:0x0511, B:354:0x0515, B:357:0x0518, B:360:0x051e, B:361:0x052a, B:363:0x052f, B:365:0x0537, B:366:0x053a, B:368:0x0540, B:370:0x0550, B:371:0x0554, B:373:0x055a, B:376:0x056a, B:381:0x056e, B:384:0x0571, B:386:0x0574, B:387:0x057a, B:389:0x0580, B:391:0x0592, B:397:0x059c, B:399:0x05a4, B:400:0x05a7, B:402:0x05ad, B:404:0x05b9, B:406:0x05bd, B:409:0x05c0, B:411:0x05d6, B:412:0x05e2), top: B:14:0x0068, inners: #2, #3, #4, #5, #7, #8, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0226 A[Catch: CertPathReviewerException -> 0x05e3, TryCatch #6 {CertPathReviewerException -> 0x05e3, blocks: (B:15:0x0068, B:19:0x0077, B:22:0x0084, B:26:0x0094, B:27:0x009f, B:29:0x00a5, B:32:0x00c6, B:33:0x00ce, B:35:0x00d4, B:41:0x00d9, B:42:0x00e5, B:48:0x00f1, B:51:0x00f8, B:52:0x0101, B:54:0x0107, B:57:0x0111, B:64:0x011a, B:66:0x011e, B:68:0x01ee, B:70:0x01f2, B:71:0x01fb, B:73:0x0201, B:75:0x020d, B:82:0x0214, B:80:0x0217, B:86:0x021e, B:88:0x0226, B:89:0x022f, B:91:0x0235, B:100:0x0253, B:101:0x025f, B:102:0x0260, B:108:0x0264, B:110:0x026c, B:111:0x0272, B:113:0x0278, B:116:0x029c, B:118:0x02a6, B:120:0x02ab, B:121:0x02b7, B:123:0x02b8, B:124:0x02c4, B:127:0x02c9, B:128:0x02dc, B:130:0x02e2, B:132:0x0308, B:134:0x0320, B:135:0x0317, B:138:0x0325, B:139:0x032b, B:141:0x0331, B:144:0x0339, B:157:0x035b, B:149:0x033e, B:150:0x034a, B:152:0x034c, B:153:0x0358, B:162:0x0367, B:171:0x0389, B:173:0x0393, B:174:0x0397, B:176:0x039d, B:190:0x03ad, B:179:0x03ba, B:200:0x03c7, B:202:0x03d1, B:106:0x040f, B:209:0x03d9, B:210:0x03e7, B:212:0x03e8, B:213:0x03f4, B:222:0x03f6, B:223:0x0404, B:224:0x0124, B:225:0x0128, B:227:0x012e, B:230:0x0144, B:232:0x014e, B:233:0x0151, B:235:0x0157, B:236:0x0167, B:238:0x016d, B:240:0x0179, B:241:0x0186, B:242:0x018c, B:244:0x0192, B:252:0x01ab, B:256:0x017c, B:258:0x0180, B:261:0x01d8, B:265:0x01e1, B:266:0x01ed, B:273:0x041d, B:274:0x0429, B:276:0x042a, B:281:0x043d, B:283:0x0447, B:284:0x044c, B:286:0x0452, B:289:0x0460, B:304:0x0473, B:311:0x05c8, B:312:0x05d4, B:314:0x047e, B:315:0x048a, B:316:0x048b, B:318:0x0491, B:320:0x0499, B:322:0x049f, B:324:0x04a7, B:325:0x04aa, B:327:0x04b0, B:329:0x04c0, B:330:0x04c4, B:332:0x04ca, B:334:0x04d2, B:337:0x04d5, B:339:0x04d8, B:340:0x04dc, B:342:0x04e2, B:345:0x04f2, B:347:0x04fc, B:348:0x04ff, B:350:0x0505, B:352:0x0511, B:354:0x0515, B:357:0x0518, B:360:0x051e, B:361:0x052a, B:363:0x052f, B:365:0x0537, B:366:0x053a, B:368:0x0540, B:370:0x0550, B:371:0x0554, B:373:0x055a, B:376:0x056a, B:381:0x056e, B:384:0x0571, B:386:0x0574, B:387:0x057a, B:389:0x0580, B:391:0x0592, B:397:0x059c, B:399:0x05a4, B:400:0x05a7, B:402:0x05ad, B:404:0x05b9, B:406:0x05bd, B:409:0x05c0, B:411:0x05d6, B:412:0x05e2), top: B:14:0x0068, inners: #2, #3, #4, #5, #7, #8, #9, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void checkPolicy() {
        PKIXPolicyNode pKIXPolicyNode;
        PKIXPolicyNode pKIXPolicyNode2;
        int i;
        int i2;
        int i3;
        ASN1Primitive aSN1Primitive;
        Set<String> set;
        HashSet hashSet;
        int intValueExact;
        int intValueExact2;
        HashSet hashSet2;
        Enumeration objects;
        int i4;
        Set<String> criticalExtensionOIDs;
        int i5;
        Set<String> initialPolicies = this.pkixParams.getInitialPolicies();
        int i6 = this.n + 1;
        ArrayList[] arrayListArr = new ArrayList[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            arrayListArr[i7] = new ArrayList();
        }
        HashSet hashSet3 = new HashSet();
        hashSet3.add(RFC3280CertPathUtilities.ANY_POLICY);
        PKIXPolicyNode pKIXPolicyNode3 = new PKIXPolicyNode(new ArrayList(), 0, hashSet3, null, new HashSet(), RFC3280CertPathUtilities.ANY_POLICY, false);
        arrayListArr[0].add(pKIXPolicyNode3);
        int i8 = this.pkixParams.isExplicitPolicyRequired() ? 0 : this.n + 1;
        int i9 = this.pkixParams.isAnyPolicyInhibited() ? 0 : this.n + 1;
        int i10 = this.pkixParams.isPolicyMappingInhibited() ? 0 : this.n + 1;
        try {
            int size = this.certs.size() - 1;
            X509Certificate x509Certificate = null;
            HashSet hashSet4 = null;
            while (size >= 0) {
                int i11 = this.n - size;
                X509Certificate x509Certificate2 = (X509Certificate) this.certs.get(size);
                PKIXPolicyNode pKIXPolicyNode4 = pKIXPolicyNode3;
                try {
                    ASN1Sequence aSN1Sequence = (ASN1Sequence) getExtensionValue(x509Certificate2, CERTIFICATE_POLICIES);
                    if (aSN1Sequence == null || pKIXPolicyNode4 == null) {
                        i = i8;
                        i2 = i9;
                        i3 = i10;
                    } else {
                        Enumeration objects2 = aSN1Sequence.getObjects();
                        i = i8;
                        HashSet hashSet5 = new HashSet();
                        while (objects2.hasMoreElements()) {
                            PolicyInformation policyInformation = PolicyInformation.getInstance(objects2.nextElement());
                            int i12 = i9;
                            ASN1ObjectIdentifier policyIdentifier = policyInformation.getPolicyIdentifier();
                            int i13 = i10;
                            hashSet5.add(policyIdentifier.getId());
                            if (!RFC3280CertPathUtilities.ANY_POLICY.equals(policyIdentifier.getId())) {
                                try {
                                    Set qualifierSet = getQualifierSet(policyInformation.getPolicyQualifiers());
                                    if (!processCertD1i(i11, arrayListArr, policyIdentifier, qualifierSet)) {
                                        processCertD1ii(i11, arrayListArr, policyIdentifier, qualifierSet);
                                    }
                                } catch (CertPathValidatorException e) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyQualifierError"), e, this.certPath, size);
                                }
                            }
                            i9 = i12;
                            i10 = i13;
                        }
                        i2 = i9;
                        i3 = i10;
                        if (hashSet4 != null && !hashSet4.contains(RFC3280CertPathUtilities.ANY_POLICY)) {
                            HashSet hashSet6 = new HashSet();
                            for (Object obj : hashSet4) {
                                if (hashSet5.contains(obj)) {
                                    hashSet6.add(obj);
                                }
                            }
                            hashSet2 = hashSet6;
                            if (i2 <= 0 || (i11 < this.n && isSelfIssued(x509Certificate2))) {
                                objects = aSN1Sequence.getObjects();
                                while (true) {
                                    if (objects.hasMoreElements()) {
                                        break;
                                    }
                                    PolicyInformation policyInformation2 = PolicyInformation.getInstance(objects.nextElement());
                                    if (RFC3280CertPathUtilities.ANY_POLICY.equals(policyInformation2.getPolicyIdentifier().getId())) {
                                        try {
                                            break;
                                        } catch (CertPathValidatorException e2) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyQualifierError"), e2, this.certPath, size);
                                        }
                                    }
                                }
                            }
                            i4 = i11 - 1;
                            while (i4 >= 0) {
                                ArrayList arrayList = arrayListArr[i4];
                                int i14 = i4;
                                HashSet hashSet7 = hashSet2;
                                PKIXPolicyNode pKIXPolicyNode5 = pKIXPolicyNode4;
                                while (i5 < arrayList.size()) {
                                    PKIXPolicyNode pKIXPolicyNode6 = (PKIXPolicyNode) arrayList.get(i5);
                                    i5 = (pKIXPolicyNode6.hasChildren() || (pKIXPolicyNode5 = removePolicyNode(pKIXPolicyNode5, arrayListArr, pKIXPolicyNode6)) != null) ? i5 + 1 : 0;
                                }
                                pKIXPolicyNode4 = pKIXPolicyNode5;
                                i4 = i14 - 1;
                                hashSet2 = hashSet7;
                            }
                            HashSet hashSet8 = hashSet2;
                            criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs != null) {
                                boolean contains = criticalExtensionOIDs.contains(CERTIFICATE_POLICIES);
                                ArrayList arrayList2 = arrayListArr[i11];
                                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                                    ((PKIXPolicyNode) arrayList2.get(i15)).setCritical(contains);
                                }
                            }
                            hashSet4 = hashSet8;
                        }
                        hashSet2 = hashSet5;
                        if (i2 <= 0) {
                        }
                        objects = aSN1Sequence.getObjects();
                        while (true) {
                            if (objects.hasMoreElements()) {
                            }
                        }
                        i4 = i11 - 1;
                        while (i4 >= 0) {
                        }
                        HashSet hashSet82 = hashSet2;
                        criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs != null) {
                        }
                        hashSet4 = hashSet82;
                    }
                    if (aSN1Sequence == null) {
                        pKIXPolicyNode4 = null;
                    }
                    if (i <= 0 && pKIXPolicyNode4 == null) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noValidPolicyTree"));
                    }
                    if (i11 != this.n) {
                        try {
                            ASN1Primitive extensionValue = getExtensionValue(x509Certificate2, POLICY_MAPPINGS);
                            if (extensionValue != null) {
                                ASN1Sequence aSN1Sequence2 = (ASN1Sequence) extensionValue;
                                aSN1Primitive = extensionValue;
                                int i16 = 0;
                                while (i16 < aSN1Sequence2.size()) {
                                    ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence2.getObjectAt(i16);
                                    ASN1Sequence aSN1Sequence4 = aSN1Sequence2;
                                    ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) aSN1Sequence3.getObjectAt(0);
                                    ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (ASN1ObjectIdentifier) aSN1Sequence3.getObjectAt(1);
                                    if (RFC3280CertPathUtilities.ANY_POLICY.equals(aSN1ObjectIdentifier.getId())) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.invalidPolicyMapping"), this.certPath, size);
                                    }
                                    if (RFC3280CertPathUtilities.ANY_POLICY.equals(aSN1ObjectIdentifier2.getId())) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.invalidPolicyMapping"), this.certPath, size);
                                    }
                                    i16++;
                                    aSN1Sequence2 = aSN1Sequence4;
                                }
                            } else {
                                aSN1Primitive = extensionValue;
                            }
                            if (aSN1Primitive != null) {
                                ASN1Sequence aSN1Sequence5 = (ASN1Sequence) aSN1Primitive;
                                HashMap hashMap = new HashMap();
                                HashSet<String> hashSet9 = new HashSet();
                                set = initialPolicies;
                                hashSet = hashSet4;
                                int i17 = 0;
                                while (i17 < aSN1Sequence5.size()) {
                                    ASN1Sequence aSN1Sequence6 = (ASN1Sequence) aSN1Sequence5.getObjectAt(i17);
                                    ASN1Sequence aSN1Sequence7 = aSN1Sequence5;
                                    String id = ((ASN1ObjectIdentifier) aSN1Sequence6.getObjectAt(0)).getId();
                                    int i18 = i17;
                                    String id2 = ((ASN1ObjectIdentifier) aSN1Sequence6.getObjectAt(1)).getId();
                                    if (hashMap.containsKey(id)) {
                                        ((Set) hashMap.get(id)).add(id2);
                                    } else {
                                        HashSet hashSet10 = new HashSet();
                                        hashSet10.add(id2);
                                        hashMap.put(id, hashSet10);
                                        hashSet9.add(id);
                                    }
                                    i17 = i18 + 1;
                                    aSN1Sequence5 = aSN1Sequence7;
                                }
                                PKIXPolicyNode pKIXPolicyNode7 = pKIXPolicyNode4;
                                for (String str : hashSet9) {
                                    if (i3 > 0) {
                                        try {
                                            prepareNextCertB1(i11, arrayListArr, str, hashMap, x509Certificate2);
                                        } catch (CertPathValidatorException e3) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyQualifierError"), e3, this.certPath, size);
                                        } catch (AnnotatedException e4) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyExtError"), e4, this.certPath, size);
                                        }
                                    } else if (i3 <= 0) {
                                        pKIXPolicyNode7 = prepareNextCertB2(i11, arrayListArr, str, pKIXPolicyNode7);
                                    }
                                }
                                pKIXPolicyNode4 = pKIXPolicyNode7;
                            } else {
                                set = initialPolicies;
                                hashSet = hashSet4;
                            }
                            if (isSelfIssued(x509Certificate2)) {
                                i8 = i;
                                i9 = i2;
                                i10 = i3;
                            } else {
                                i8 = i != 0 ? i - 1 : i;
                                i10 = i3 != 0 ? i3 - 1 : i3;
                                i9 = i2 != 0 ? i2 - 1 : i2;
                            }
                            try {
                                ASN1Sequence aSN1Sequence8 = (ASN1Sequence) getExtensionValue(x509Certificate2, POLICY_CONSTRAINTS);
                                if (aSN1Sequence8 != null) {
                                    Enumeration objects3 = aSN1Sequence8.getObjects();
                                    while (objects3.hasMoreElements()) {
                                        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects3.nextElement();
                                        int tagNo = aSN1TaggedObject.getTagNo();
                                        if (tagNo == 0) {
                                            int intValueExact3 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact();
                                            if (intValueExact3 < i8) {
                                                i8 = intValueExact3;
                                            }
                                        } else if (tagNo == 1 && (intValueExact2 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact()) < i10) {
                                            i10 = intValueExact2;
                                        }
                                    }
                                }
                                try {
                                    ASN1Integer aSN1Integer = (ASN1Integer) getExtensionValue(x509Certificate2, INHIBIT_ANY_POLICY);
                                    if (aSN1Integer != null && (intValueExact = aSN1Integer.intValueExact()) < i9) {
                                        i9 = intValueExact;
                                    }
                                } catch (AnnotatedException unused) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyInhibitExtError"), this.certPath, size);
                                }
                            } catch (AnnotatedException unused2) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyConstExtError"), this.certPath, size);
                            }
                        } catch (AnnotatedException e5) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyMapExtError"), e5, this.certPath, size);
                        }
                    } else {
                        set = initialPolicies;
                        hashSet = hashSet4;
                        i8 = i;
                        i9 = i2;
                        i10 = i3;
                    }
                    pKIXPolicyNode3 = pKIXPolicyNode4;
                    size--;
                    x509Certificate = x509Certificate2;
                    hashSet4 = hashSet;
                    initialPolicies = set;
                } catch (AnnotatedException e6) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyExtError"), e6, this.certPath, size);
                }
            }
            Set<String> set2 = initialPolicies;
            PKIXPolicyNode pKIXPolicyNode8 = pKIXPolicyNode3;
            int i19 = i8;
            int i20 = (isSelfIssued(x509Certificate) || i19 <= 0) ? i19 : i19 - 1;
            try {
                ASN1Sequence aSN1Sequence9 = (ASN1Sequence) getExtensionValue(x509Certificate, POLICY_CONSTRAINTS);
                if (aSN1Sequence9 != null) {
                    Enumeration objects4 = aSN1Sequence9.getObjects();
                    int i21 = i20;
                    while (objects4.hasMoreElements()) {
                        ASN1TaggedObject aSN1TaggedObject2 = (ASN1TaggedObject) objects4.nextElement();
                        if (aSN1TaggedObject2.getTagNo() == 0 && ASN1Integer.getInstance(aSN1TaggedObject2, false).intValueExact() == 0) {
                            i21 = 0;
                        }
                    }
                    i20 = i21;
                }
                if (pKIXPolicyNode8 != null) {
                    if (isAnyPolicy(set2)) {
                        if (this.pkixParams.isExplicitPolicyRequired()) {
                            if (hashSet4.isEmpty()) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.explicitPolicy"), this.certPath, size);
                            }
                            HashSet hashSet11 = new HashSet();
                            for (int i22 = 0; i22 < i6; i22++) {
                                ArrayList arrayList3 = arrayListArr[i22];
                                for (int i23 = 0; i23 < arrayList3.size(); i23++) {
                                    PKIXPolicyNode pKIXPolicyNode9 = (PKIXPolicyNode) arrayList3.get(i23);
                                    if (RFC3280CertPathUtilities.ANY_POLICY.equals(pKIXPolicyNode9.getValidPolicy())) {
                                        Iterator children = pKIXPolicyNode9.getChildren();
                                        while (children.hasNext()) {
                                            hashSet11.add(children.next());
                                        }
                                    }
                                }
                            }
                            Iterator it = hashSet11.iterator();
                            while (it.hasNext()) {
                                hashSet4.contains(((PKIXPolicyNode) it.next()).getValidPolicy());
                            }
                            if (pKIXPolicyNode8 != null) {
                                pKIXPolicyNode = pKIXPolicyNode8;
                                for (int i24 = this.n - 1; i24 >= 0; i24--) {
                                    ArrayList arrayList4 = arrayListArr[i24];
                                    for (int i25 = 0; i25 < arrayList4.size(); i25++) {
                                        PKIXPolicyNode pKIXPolicyNode10 = (PKIXPolicyNode) arrayList4.get(i25);
                                        if (!pKIXPolicyNode10.hasChildren()) {
                                            pKIXPolicyNode = removePolicyNode(pKIXPolicyNode, arrayListArr, pKIXPolicyNode10);
                                        }
                                    }
                                }
                            }
                        }
                        pKIXPolicyNode2 = pKIXPolicyNode8;
                    } else {
                        HashSet<PKIXPolicyNode> hashSet12 = new HashSet();
                        for (int i26 = 0; i26 < i6; i26++) {
                            ArrayList arrayList5 = arrayListArr[i26];
                            for (int i27 = 0; i27 < arrayList5.size(); i27++) {
                                PKIXPolicyNode pKIXPolicyNode11 = (PKIXPolicyNode) arrayList5.get(i27);
                                if (RFC3280CertPathUtilities.ANY_POLICY.equals(pKIXPolicyNode11.getValidPolicy())) {
                                    Iterator children2 = pKIXPolicyNode11.getChildren();
                                    while (children2.hasNext()) {
                                        PKIXPolicyNode pKIXPolicyNode12 = (PKIXPolicyNode) children2.next();
                                        if (!RFC3280CertPathUtilities.ANY_POLICY.equals(pKIXPolicyNode12.getValidPolicy())) {
                                            hashSet12.add(pKIXPolicyNode12);
                                        }
                                    }
                                }
                            }
                        }
                        pKIXPolicyNode = pKIXPolicyNode8;
                        for (PKIXPolicyNode pKIXPolicyNode13 : hashSet12) {
                            Set<String> set3 = set2;
                            if (!set3.contains(pKIXPolicyNode13.getValidPolicy())) {
                                pKIXPolicyNode = removePolicyNode(pKIXPolicyNode, arrayListArr, pKIXPolicyNode13);
                            }
                            set2 = set3;
                        }
                        if (pKIXPolicyNode != null) {
                            for (int i28 = this.n - 1; i28 >= 0; i28--) {
                                ArrayList arrayList6 = arrayListArr[i28];
                                for (int i29 = 0; i29 < arrayList6.size(); i29++) {
                                    PKIXPolicyNode pKIXPolicyNode14 = (PKIXPolicyNode) arrayList6.get(i29);
                                    if (!pKIXPolicyNode14.hasChildren()) {
                                        pKIXPolicyNode = removePolicyNode(pKIXPolicyNode, arrayListArr, pKIXPolicyNode14);
                                    }
                                }
                            }
                        }
                    }
                    pKIXPolicyNode2 = pKIXPolicyNode;
                } else {
                    if (this.pkixParams.isExplicitPolicyRequired()) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.explicitPolicy"), this.certPath, size);
                    }
                    pKIXPolicyNode2 = null;
                }
                if (i20 <= 0 && pKIXPolicyNode2 == null) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.invalidPolicy"));
                }
            } catch (AnnotatedException unused3) {
                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyConstExtError"), this.certPath, size);
            }
        } catch (CertPathReviewerException e7) {
            addError(e7.getErrorMessage(), e7.getIndex());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:30|(2:127|128)(2:32|(2:121|122)(3:34|(2:38|(1:40))|41))|(2:42|43)|44|(18:83|84|(15:86|87|88|(11:90|91|(2:94|92)|95|96|(2:99|97)|100|101|102|103|104)|111|91|(1:92)|95|96|(1:97)|100|101|102|103|104)|114|87|88|(0)|111|91|(1:92)|95|96|(1:97)|100|101|102|103|104)(1:46)|(1:50)|51|(7:53|(1:57)|58|59|(2:61|(1:63))(1:79)|64|(7:66|(1:78)|70|71|72|74|75))|82|70|71|72|74|75) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:(2:83|84)|(3:(15:86|87|88|(11:90|91|(2:94|92)|95|96|(2:99|97)|100|101|102|103|104)|111|91|(1:92)|95|96|(1:97)|100|101|102|103|104)|103|104)|114|87|88|(0)|111|91|(1:92)|95|96|(1:97)|100|101|102) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02ee, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02ef, code lost:
    
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x028a, code lost:
    
        addError(new org.bouncycastle.i18n.ErrorBundle(org.bouncycastle.x509.PKIXCertPathReviewer.RESOURCE_NAME, "CertPathReviewer.crlAuthInfoAccError"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0394, code lost:
    
        addError(new org.bouncycastle.i18n.ErrorBundle(org.bouncycastle.x509.PKIXCertPathReviewer.RESOURCE_NAME, "CertPathReviewer.pubKeyError"), r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0265 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0285 A[Catch: AnnotatedException -> 0x028a, TRY_LEAVE, TryCatch #0 {AnnotatedException -> 0x028a, blocks: (B:88:0x027d, B:90:0x0285), top: B:87:0x027d }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a7 A[LOOP:1: B:92:0x02a1->B:94:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ca A[LOOP:2: B:97:0x02c4->B:99:0x02ca, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void checkSignatures() {
        TrustAnchor trustAnchor;
        TrustAnchor trustAnchor2;
        X500Principal x500Principal;
        X509Certificate x509Certificate;
        PublicKey publicKey;
        int size;
        ErrorBundle errorBundle;
        ErrorBundle errorBundle2;
        CRLDistPoint cRLDistPoint;
        AuthorityInformationAccess authorityInformationAccess;
        Iterator it;
        Iterator it2;
        int i;
        ASN1Primitive extensionValue;
        ASN1Primitive extensionValue2;
        char c;
        AuthorityKeyIdentifier authorityKeyIdentifier;
        GeneralNames authorityCertIssuer;
        boolean[] keyUsage;
        X509Certificate x509Certificate2;
        Collection trustAnchors;
        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certPathValidDate", new Object[]{new TrustedInput(this.validDate), new TrustedInput(this.currentDate)}));
        try {
            List list = this.certs;
            x509Certificate2 = (X509Certificate) list.get(list.size() - 1);
            trustAnchors = getTrustAnchors(x509Certificate2, this.pkixParams.getTrustAnchors());
        } catch (CertPathReviewerException e) {
            e = e;
            trustAnchor = null;
        } catch (Throwable th) {
            th = th;
            trustAnchor = null;
        }
        if (trustAnchors.size() > 1) {
            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.conflictingTrustAnchors", new Object[]{Integers.valueOf(trustAnchors.size()), new UntrustedInput(x509Certificate2.getIssuerX500Principal())}));
        } else {
            if (!trustAnchors.isEmpty()) {
                trustAnchor = (TrustAnchor) trustAnchors.iterator().next();
                try {
                    try {
                        CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, trustAnchor.getTrustedCert() != null ? trustAnchor.getTrustedCert().getPublicKey() : trustAnchor.getCAPublicKey(), this.pkixParams.getSigProvider());
                    } catch (SignatureException unused) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustButInvalidCert"));
                    } catch (Exception unused2) {
                    }
                } catch (CertPathReviewerException e2) {
                    e = e2;
                    addError(e.getErrorMessage());
                    trustAnchor2 = trustAnchor;
                    if (trustAnchor2 == null) {
                    }
                    if (trustAnchor2 == null) {
                    }
                    X509Certificate x509Certificate3 = x509Certificate;
                    X500Principal x500Principal2 = x500Principal;
                    PublicKey publicKey2 = publicKey;
                    size = this.certs.size() - 1;
                    while (size >= 0) {
                    }
                    this.trustAnchor = trustAnchor2;
                    this.subjectPublicKey = publicKey2;
                } catch (Throwable th2) {
                    th = th2;
                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.unknown", new Object[]{new UntrustedInput(th.getMessage()), new UntrustedInput(th)}));
                    trustAnchor2 = trustAnchor;
                    if (trustAnchor2 == null) {
                    }
                    if (trustAnchor2 == null) {
                    }
                    X509Certificate x509Certificate32 = x509Certificate;
                    X500Principal x500Principal22 = x500Principal;
                    PublicKey publicKey22 = publicKey;
                    size = this.certs.size() - 1;
                    while (size >= 0) {
                    }
                    this.trustAnchor = trustAnchor2;
                    this.subjectPublicKey = publicKey22;
                }
                trustAnchor2 = trustAnchor;
                if (trustAnchor2 == null) {
                    X509Certificate trustedCert = trustAnchor2.getTrustedCert();
                    try {
                        x500Principal = trustedCert != null ? getSubjectPrincipal(trustedCert) : new X500Principal(trustAnchor2.getCAName());
                    } catch (IllegalArgumentException unused3) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustDNInvalid", new Object[]{new UntrustedInput(trustAnchor2.getCAName())}));
                        x500Principal = null;
                    }
                    if (trustedCert != null && (keyUsage = trustedCert.getKeyUsage()) != null && (keyUsage.length <= 5 || !keyUsage[5])) {
                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustKeyUsage"));
                    }
                } else {
                    x500Principal = null;
                }
                if (trustAnchor2 == null) {
                    x509Certificate = trustAnchor2.getTrustedCert();
                    publicKey = x509Certificate != null ? x509Certificate.getPublicKey() : trustAnchor2.getCAPublicKey();
                    try {
                        AlgorithmIdentifier algorithmIdentifier = getAlgorithmIdentifier(publicKey);
                        algorithmIdentifier.getAlgorithm();
                        algorithmIdentifier.getParameters();
                    } catch (CertPathValidatorException unused4) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustPubKeyError"));
                    }
                } else {
                    x509Certificate = null;
                    publicKey = null;
                }
                X509Certificate x509Certificate322 = x509Certificate;
                X500Principal x500Principal222 = x500Principal;
                PublicKey publicKey222 = publicKey;
                size = this.certs.size() - 1;
                while (size >= 0) {
                    int i2 = this.n - size;
                    X509Certificate x509Certificate4 = (X509Certificate) this.certs.get(size);
                    if (publicKey222 != null) {
                        try {
                            CertPathValidatorUtilities.verifyX509Certificate(x509Certificate4, publicKey222, this.pkixParams.getSigProvider());
                        } catch (GeneralSecurityException e3) {
                            errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.signatureNotVerified", new Object[]{e3.getMessage(), e3, e3.getClass().getName()});
                            addError(errorBundle, size);
                            x509Certificate4.checkValidity(this.validDate);
                            if (this.pkixParams.isRevocationEnabled()) {
                            }
                            if (x500Principal222 != null) {
                            }
                            if (i != this.n) {
                            }
                            c = 5;
                            x500Principal222 = x509Certificate4.getSubjectX500Principal();
                            publicKey222 = getNextWorkingKey(this.certs, size);
                            AlgorithmIdentifier algorithmIdentifier2 = getAlgorithmIdentifier(publicKey222);
                            algorithmIdentifier2.getAlgorithm();
                            algorithmIdentifier2.getParameters();
                            size--;
                            x509Certificate322 = x509Certificate4;
                        }
                    } else if (isSelfIssued(x509Certificate4)) {
                        try {
                            CertPathValidatorUtilities.verifyX509Certificate(x509Certificate4, x509Certificate4.getPublicKey(), this.pkixParams.getSigProvider());
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.rootKeyIsValidButNotATrustAnchor"), size);
                        } catch (GeneralSecurityException e4) {
                            errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.signatureNotVerified", new Object[]{e4.getMessage(), e4, e4.getClass().getName()});
                            addError(errorBundle, size);
                            x509Certificate4.checkValidity(this.validDate);
                            if (this.pkixParams.isRevocationEnabled()) {
                            }
                            if (x500Principal222 != null) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certWrongIssuer", new Object[]{x500Principal222.getName(), x509Certificate4.getIssuerX500Principal().getName()}), size);
                            }
                            if (i != this.n) {
                            }
                            c = 5;
                            x500Principal222 = x509Certificate4.getSubjectX500Principal();
                            publicKey222 = getNextWorkingKey(this.certs, size);
                            AlgorithmIdentifier algorithmIdentifier22 = getAlgorithmIdentifier(publicKey222);
                            algorithmIdentifier22.getAlgorithm();
                            algorithmIdentifier22.getParameters();
                            size--;
                            x509Certificate322 = x509Certificate4;
                        }
                    } else {
                        ErrorBundle errorBundle3 = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.NoIssuerPublicKey");
                        byte[] extensionValue3 = x509Certificate4.getExtensionValue(Extension.authorityKeyIdentifier.getId());
                        if (extensionValue3 != null && (authorityCertIssuer = (authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(DEROctetString.getInstance(extensionValue3).getOctets())).getAuthorityCertIssuer()) != null) {
                            GeneralName generalName = authorityCertIssuer.getNames()[0];
                            BigInteger authorityCertSerialNumber = authorityKeyIdentifier.getAuthorityCertSerialNumber();
                            if (authorityCertSerialNumber != null) {
                                errorBundle3.setExtraArguments(new Object[]{new LocaleString(RESOURCE_NAME, "missingIssuer"), " \"", generalName, "\" ", new LocaleString(RESOURCE_NAME, "missingSerial"), " ", authorityCertSerialNumber});
                            }
                        }
                        addError(errorBundle3, size);
                    }
                    try {
                        x509Certificate4.checkValidity(this.validDate);
                    } catch (CertificateExpiredException unused5) {
                        errorBundle2 = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certificateExpired", new Object[]{new TrustedInput(x509Certificate4.getNotAfter())});
                        addError(errorBundle2, size);
                        if (this.pkixParams.isRevocationEnabled()) {
                        }
                        if (x500Principal222 != null) {
                        }
                        if (i != this.n) {
                        }
                        c = 5;
                        x500Principal222 = x509Certificate4.getSubjectX500Principal();
                        publicKey222 = getNextWorkingKey(this.certs, size);
                        AlgorithmIdentifier algorithmIdentifier222 = getAlgorithmIdentifier(publicKey222);
                        algorithmIdentifier222.getAlgorithm();
                        algorithmIdentifier222.getParameters();
                        size--;
                        x509Certificate322 = x509Certificate4;
                    } catch (CertificateNotYetValidException unused6) {
                        errorBundle2 = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certificateNotYetValid", new Object[]{new TrustedInput(x509Certificate4.getNotBefore())});
                        addError(errorBundle2, size);
                        if (this.pkixParams.isRevocationEnabled()) {
                        }
                        if (x500Principal222 != null) {
                        }
                        if (i != this.n) {
                        }
                        c = 5;
                        x500Principal222 = x509Certificate4.getSubjectX500Principal();
                        publicKey222 = getNextWorkingKey(this.certs, size);
                        AlgorithmIdentifier algorithmIdentifier2222 = getAlgorithmIdentifier(publicKey222);
                        algorithmIdentifier2222.getAlgorithm();
                        algorithmIdentifier2222.getParameters();
                        size--;
                        x509Certificate322 = x509Certificate4;
                    }
                    if (this.pkixParams.isRevocationEnabled()) {
                        try {
                            extensionValue2 = getExtensionValue(x509Certificate4, CRL_DIST_POINTS);
                        } catch (AnnotatedException unused7) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlDistPtExtError"), size);
                        }
                        try {
                            if (extensionValue2 != null) {
                                cRLDistPoint = CRLDistPoint.getInstance(extensionValue2);
                                extensionValue = getExtensionValue(x509Certificate4, AUTH_INFO_ACCESS);
                                if (extensionValue != null) {
                                    authorityInformationAccess = AuthorityInformationAccess.getInstance(extensionValue);
                                    Vector cRLDistUrls = getCRLDistUrls(cRLDistPoint);
                                    Vector oCSPUrls = getOCSPUrls(authorityInformationAccess);
                                    it = cRLDistUrls.iterator();
                                    while (it.hasNext()) {
                                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlDistPoint", new Object[]{new UntrustedUrlInput(it.next())}), size);
                                    }
                                    it2 = oCSPUrls.iterator();
                                    while (it2.hasNext()) {
                                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ocspLocation", new Object[]{new UntrustedUrlInput(it2.next())}), size);
                                    }
                                    i = i2;
                                    checkRevocation(this.pkixParams, x509Certificate4, this.validDate, x509Certificate322, publicKey222, cRLDistUrls, oCSPUrls, size);
                                }
                                authorityInformationAccess = null;
                                Vector cRLDistUrls2 = getCRLDistUrls(cRLDistPoint);
                                Vector oCSPUrls2 = getOCSPUrls(authorityInformationAccess);
                                it = cRLDistUrls2.iterator();
                                while (it.hasNext()) {
                                }
                                it2 = oCSPUrls2.iterator();
                                while (it2.hasNext()) {
                                }
                                i = i2;
                                checkRevocation(this.pkixParams, x509Certificate4, this.validDate, x509Certificate322, publicKey222, cRLDistUrls2, oCSPUrls2, size);
                            }
                            checkRevocation(this.pkixParams, x509Certificate4, this.validDate, x509Certificate322, publicKey222, cRLDistUrls2, oCSPUrls2, size);
                        } catch (CertPathReviewerException e5) {
                            e = e5;
                            addError(e.getErrorMessage(), size);
                            if (x500Principal222 != null) {
                            }
                            if (i != this.n) {
                            }
                            c = 5;
                            x500Principal222 = x509Certificate4.getSubjectX500Principal();
                            publicKey222 = getNextWorkingKey(this.certs, size);
                            AlgorithmIdentifier algorithmIdentifier22222 = getAlgorithmIdentifier(publicKey222);
                            algorithmIdentifier22222.getAlgorithm();
                            algorithmIdentifier22222.getParameters();
                            size--;
                            x509Certificate322 = x509Certificate4;
                        }
                        cRLDistPoint = null;
                        extensionValue = getExtensionValue(x509Certificate4, AUTH_INFO_ACCESS);
                        if (extensionValue != null) {
                        }
                        authorityInformationAccess = null;
                        Vector cRLDistUrls22 = getCRLDistUrls(cRLDistPoint);
                        Vector oCSPUrls22 = getOCSPUrls(authorityInformationAccess);
                        it = cRLDistUrls22.iterator();
                        while (it.hasNext()) {
                        }
                        it2 = oCSPUrls22.iterator();
                        while (it2.hasNext()) {
                        }
                        i = i2;
                    } else {
                        i = i2;
                    }
                    if (x500Principal222 != null && !x509Certificate4.getIssuerX500Principal().equals(x500Principal222)) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certWrongIssuer", new Object[]{x500Principal222.getName(), x509Certificate4.getIssuerX500Principal().getName()}), size);
                    }
                    if (i != this.n) {
                        if (x509Certificate4 != null && x509Certificate4.getVersion() == 1) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCACert"), size);
                        }
                        try {
                            BasicConstraints basicConstraints = BasicConstraints.getInstance(getExtensionValue(x509Certificate4, BASIC_CONSTRAINTS));
                            if (basicConstraints == null) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noBasicConstraints"), size);
                            } else if (!basicConstraints.isCA()) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCACert"), size);
                            }
                        } catch (AnnotatedException unused8) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.errorProcesingBC"), size);
                        }
                        boolean[] keyUsage2 = x509Certificate4.getKeyUsage();
                        if (keyUsage2 != null) {
                            c = 5;
                            if (keyUsage2.length <= 5 || !keyUsage2[5]) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCertSign"), size);
                            }
                            x500Principal222 = x509Certificate4.getSubjectX500Principal();
                            publicKey222 = getNextWorkingKey(this.certs, size);
                            AlgorithmIdentifier algorithmIdentifier222222 = getAlgorithmIdentifier(publicKey222);
                            algorithmIdentifier222222.getAlgorithm();
                            algorithmIdentifier222222.getParameters();
                            size--;
                            x509Certificate322 = x509Certificate4;
                        }
                    }
                    c = 5;
                    x500Principal222 = x509Certificate4.getSubjectX500Principal();
                    publicKey222 = getNextWorkingKey(this.certs, size);
                    AlgorithmIdentifier algorithmIdentifier2222222 = getAlgorithmIdentifier(publicKey222);
                    algorithmIdentifier2222222.getAlgorithm();
                    algorithmIdentifier2222222.getParameters();
                    size--;
                    x509Certificate322 = x509Certificate4;
                }
                this.trustAnchor = trustAnchor2;
                this.subjectPublicKey = publicKey222;
            }
            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noTrustAnchorFound", new Object[]{new UntrustedInput(x509Certificate2.getIssuerX500Principal()), Integers.valueOf(this.pkixParams.getTrustAnchors().size())}));
        }
        trustAnchor = null;
        trustAnchor2 = trustAnchor;
        if (trustAnchor2 == null) {
        }
        if (trustAnchor2 == null) {
        }
        X509Certificate x509Certificate3222 = x509Certificate;
        X500Principal x500Principal2222 = x500Principal;
        PublicKey publicKey2222 = publicKey;
        size = this.certs.size() - 1;
        while (size >= 0) {
        }
        this.trustAnchor = trustAnchor2;
        this.subjectPublicKey = publicKey2222;
    }

    private X509CRL getCRL(String str) throws CertPathReviewerException {
        try {
            URL url = new URL(str);
            if (!url.getProtocol().equals("http") && !url.getProtocol().equals("https")) {
                return null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return (X509CRL) CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME).generateCRL(httpURLConnection.getInputStream());
            }
            throw new Exception(httpURLConnection.getResponseMessage());
        } catch (Exception e) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.loadCrlDistPointError", new Object[]{new UntrustedInput(str), e.getMessage(), e, e.getClass().getName()}));
        }
    }

    private boolean processQcStatements(X509Certificate x509Certificate, int i) {
        ErrorBundle errorBundle;
        try {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) getExtensionValue(x509Certificate, QC_STATEMENT);
            boolean z = false;
            for (int i2 = 0; i2 < aSN1Sequence.size(); i2++) {
                QCStatement qCStatement = QCStatement.getInstance(aSN1Sequence.getObjectAt(i2));
                if (QCStatement.id_etsi_qcs_QcCompliance.equals((ASN1Primitive) qCStatement.getStatementId())) {
                    errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcEuCompliance");
                } else {
                    if (!QCStatement.id_qcs_pkixQCSyntax_v1.equals((ASN1Primitive) qCStatement.getStatementId())) {
                        if (QCStatement.id_etsi_qcs_QcSSCD.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcSSCD");
                        } else if (QCStatement.id_etsi_qcs_LimiteValue.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            MonetaryValue monetaryValue = MonetaryValue.getInstance(qCStatement.getStatementInfo());
                            monetaryValue.getCurrency();
                            double doubleValue = monetaryValue.getAmount().doubleValue() * Math.pow(10.0d, monetaryValue.getExponent().doubleValue());
                            addNotification(monetaryValue.getCurrency().isAlphabetic() ? new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcLimitValueAlpha", new Object[]{monetaryValue.getCurrency().getAlphabetic(), new TrustedInput(new Double(doubleValue)), monetaryValue}) : new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcLimitValueNum", new Object[]{Integers.valueOf(monetaryValue.getCurrency().getNumeric()), new TrustedInput(new Double(doubleValue)), monetaryValue}), i);
                        } else {
                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcUnknownStatement", new Object[]{qCStatement.getStatementId(), new UntrustedInput(qCStatement)}), i);
                            z = true;
                        }
                    }
                }
                addNotification(errorBundle, i);
            }
            return !z;
        } catch (AnnotatedException unused) {
            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcStatementExtError"), i);
            return false;
        }
    }

    protected void addError(ErrorBundle errorBundle) {
        this.errors[0].add(errorBundle);
    }

    protected void addError(ErrorBundle errorBundle, int i) {
        if (i < -1 || i >= this.n) {
            throw new IndexOutOfBoundsException();
        }
        this.errors[i + 1].add(errorBundle);
    }

    protected void addNotification(ErrorBundle errorBundle) {
        this.notifications[0].add(errorBundle);
    }

    protected void addNotification(ErrorBundle errorBundle, int i) {
        if (i < -1 || i >= this.n) {
            throw new IndexOutOfBoundsException();
        }
        this.notifications[i + 1].add(errorBundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023a  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void checkCRLs(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, int i) throws CertPathReviewerException {
        Iterator it;
        X509CRL x509crl;
        boolean z;
        boolean z2;
        String str;
        boolean[] keyUsage;
        X509CRL x509crl2;
        X500Principal x500Principal;
        Iterator it2;
        boolean z3;
        ErrorBundle errorBundle;
        X509CRLStoreSelector x509CRLStoreSelector = new X509CRLStoreSelector();
        try {
            x509CRLStoreSelector.addIssuerName(getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            x509CRLStoreSelector.setCertificateChecking(x509Certificate);
            try {
                Set findCRLs = PKIXCRLUtil.findCRLs(x509CRLStoreSelector, pKIXParameters);
                it = findCRLs.iterator();
                if (findCRLs.isEmpty()) {
                    Iterator it3 = PKIXCRLUtil.findCRLs(new X509CRLStoreSelector(), pKIXParameters).iterator();
                    ArrayList arrayList = new ArrayList();
                    while (it3.hasNext()) {
                        arrayList.add(((X509CRL) it3.next()).getIssuerX500Principal());
                    }
                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCrlInCertstore", new Object[]{new UntrustedInput(x509CRLStoreSelector.getIssuerNames()), new UntrustedInput(arrayList), Integers.valueOf(arrayList.size())}), i);
                }
            } catch (AnnotatedException e) {
                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlExtractionError", new Object[]{e.getCause().getMessage(), e.getCause(), e.getCause().getClass().getName()}), i);
                it = new ArrayList().iterator();
            }
            X509CRL x509crl3 = null;
            while (it.hasNext()) {
                x509crl3 = (X509CRL) it.next();
                Date thisUpdate = x509crl3.getThisUpdate();
                Date nextUpdate = x509crl3.getNextUpdate();
                Object[] objArr = {new TrustedInput(thisUpdate), new TrustedInput(nextUpdate)};
                if (nextUpdate == null || date.before(nextUpdate)) {
                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.localValidCRL", objArr), i);
                    x509crl = x509crl3;
                    z = true;
                    break;
                }
                addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.localInvalidCRL", objArr), i);
            }
            x509crl = x509crl3;
            z = false;
            if (!z) {
                X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
                Iterator it4 = vector.iterator();
                boolean z4 = z;
                while (true) {
                    if (!it4.hasNext()) {
                        z2 = z4;
                        break;
                    }
                    try {
                        String str2 = (String) it4.next();
                        X509CRL crl = getCRL(str2);
                        if (crl != null) {
                            X500Principal issuerX500Principal2 = crl.getIssuerX500Principal();
                            if (issuerX500Principal.equals(issuerX500Principal2)) {
                                x509crl2 = x509crl;
                                x500Principal = issuerX500Principal;
                                it2 = it4;
                                z3 = z4;
                                Date thisUpdate2 = crl.getThisUpdate();
                                Date nextUpdate2 = crl.getNextUpdate();
                                Object[] objArr2 = {new TrustedInput(thisUpdate2), new TrustedInput(nextUpdate2), new UntrustedUrlInput(str2)};
                                if (nextUpdate2 != null && !date.before(nextUpdate2)) {
                                    errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineInvalidCRL", objArr2);
                                }
                                try {
                                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineValidCRL", objArr2), i);
                                    x509crl = crl;
                                    z2 = true;
                                    break;
                                } catch (CertPathReviewerException e2) {
                                    e = e2;
                                    z4 = true;
                                    addNotification(e.getErrorMessage(), i);
                                    it4 = it2;
                                    x509crl = x509crl2;
                                    issuerX500Principal = x500Principal;
                                }
                            } else {
                                x509crl2 = x509crl;
                                try {
                                    x500Principal = issuerX500Principal;
                                    it2 = it4;
                                } catch (CertPathReviewerException e3) {
                                    e = e3;
                                    x500Principal = issuerX500Principal;
                                    it2 = it4;
                                    addNotification(e.getErrorMessage(), i);
                                    it4 = it2;
                                    x509crl = x509crl2;
                                    issuerX500Principal = x500Principal;
                                }
                                try {
                                    z3 = z4;
                                    try {
                                        errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineCRLWrongCA", new Object[]{new UntrustedInput(issuerX500Principal2.getName()), new UntrustedInput(x500Principal.getName()), new UntrustedUrlInput(str2)});
                                    } catch (CertPathReviewerException e4) {
                                        e = e4;
                                        z4 = z3;
                                        addNotification(e.getErrorMessage(), i);
                                        it4 = it2;
                                        x509crl = x509crl2;
                                        issuerX500Principal = x500Principal;
                                    }
                                } catch (CertPathReviewerException e5) {
                                    e = e5;
                                    addNotification(e.getErrorMessage(), i);
                                    it4 = it2;
                                    x509crl = x509crl2;
                                    issuerX500Principal = x500Principal;
                                }
                            }
                            addNotification(errorBundle, i);
                        } else {
                            x509crl2 = x509crl;
                            x500Principal = issuerX500Principal;
                            it2 = it4;
                            z3 = z4;
                        }
                        it4 = it2;
                        x509crl = x509crl2;
                        issuerX500Principal = x500Principal;
                        z4 = z3;
                    } catch (CertPathReviewerException e6) {
                        e = e6;
                        x509crl2 = x509crl;
                    }
                }
            } else {
                z2 = z;
            }
            if (x509crl != null) {
                if (x509Certificate2 != null && (keyUsage = x509Certificate2.getKeyUsage()) != null && (keyUsage.length <= 6 || !keyUsage[6])) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCrlSigningPermited"));
                }
                if (publicKey == null) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlNoIssuerPublicKey"));
                }
                try {
                    x509crl.verify(publicKey, BouncyCastleProvider.PROVIDER_NAME);
                    X509CRLEntry revokedCertificate = x509crl.getRevokedCertificate(x509Certificate.getSerialNumber());
                    if (revokedCertificate != null) {
                        if (revokedCertificate.hasExtensions()) {
                            try {
                                ASN1Enumerated aSN1Enumerated = ASN1Enumerated.getInstance(getExtensionValue(revokedCertificate, Extension.reasonCode.getId()));
                                if (aSN1Enumerated != null) {
                                    str = crlReasons[aSN1Enumerated.intValueExact()];
                                    if (str == null) {
                                        str = crlReasons[7];
                                    }
                                    LocaleString localeString = new LocaleString(RESOURCE_NAME, str);
                                    if (date.before(revokedCertificate.getRevocationDate())) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certRevoked", new Object[]{new TrustedInput(revokedCertificate.getRevocationDate()), localeString}));
                                    }
                                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.revokedAfterValidation", new Object[]{new TrustedInput(revokedCertificate.getRevocationDate()), localeString}), i);
                                }
                            } catch (AnnotatedException e7) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlReasonExtError"), e7);
                            }
                        }
                        str = null;
                        if (str == null) {
                        }
                        LocaleString localeString2 = new LocaleString(RESOURCE_NAME, str);
                        if (date.before(revokedCertificate.getRevocationDate())) {
                        }
                    } else {
                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notRevoked"), i);
                    }
                    Date nextUpdate3 = x509crl.getNextUpdate();
                    if (nextUpdate3 != null && !date.before(nextUpdate3)) {
                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlUpdateAvailable", new Object[]{new TrustedInput(nextUpdate3)}), i);
                    }
                    try {
                        ASN1Primitive extensionValue = getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT);
                        try {
                            ASN1Primitive extensionValue2 = getExtensionValue(x509crl, DELTA_CRL_INDICATOR);
                            if (extensionValue2 != null) {
                                X509CRLStoreSelector x509CRLStoreSelector2 = new X509CRLStoreSelector();
                                try {
                                    x509CRLStoreSelector2.addIssuerName(getIssuerPrincipal(x509crl).getEncoded());
                                    x509CRLStoreSelector2.setMinCRLNumber(((ASN1Integer) extensionValue2).getPositiveValue());
                                    try {
                                        x509CRLStoreSelector2.setMaxCRLNumber(((ASN1Integer) getExtensionValue(x509crl, CRL_NUMBER)).getPositiveValue().subtract(BigInteger.valueOf(1L)));
                                        try {
                                            Iterator it5 = PKIXCRLUtil.findCRLs(x509CRLStoreSelector2, pKIXParameters).iterator();
                                            while (it5.hasNext()) {
                                                try {
                                                    if (Objects.areEqual(extensionValue, getExtensionValue((X509CRL) it5.next(), ISSUING_DISTRIBUTION_POINT))) {
                                                    }
                                                } catch (AnnotatedException e8) {
                                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.distrPtExtError"), e8);
                                                }
                                            }
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noBaseCRL"));
                                        } catch (AnnotatedException e9) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlExtractionError"), e9);
                                        }
                                    } catch (AnnotatedException e10) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlNbrExtError"), e10);
                                    }
                                } catch (IOException e11) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlIssuerException"), e11);
                                }
                            }
                            if (extensionValue != null) {
                                IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(extensionValue);
                                try {
                                    BasicConstraints basicConstraints = BasicConstraints.getInstance(getExtensionValue(x509Certificate, BASIC_CONSTRAINTS));
                                    if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA()) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlOnlyUserCert"));
                                    }
                                    if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA())) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlOnlyCaCert"));
                                    }
                                    if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlOnlyAttrCert"));
                                    }
                                } catch (AnnotatedException e12) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlBCExtError"), e12);
                                }
                            }
                        } catch (AnnotatedException unused) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.deltaCrlExtError"));
                        }
                    } catch (AnnotatedException unused2) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.distrPtExtError"));
                    }
                } catch (Exception e13) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlVerifyFailed"), e13);
                }
            }
            if (!z2) {
                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noValidCrlFound"));
            }
        } catch (IOException e14) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlIssuerException"), e14);
        }
    }

    protected void checkRevocation(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, Vector vector2, int i) throws CertPathReviewerException {
        checkCRLs(pKIXParameters, x509Certificate, date, x509Certificate2, publicKey, vector, i);
    }

    protected void doChecks() {
        if (!this.initialized) {
            throw new IllegalStateException("Object not initialized. Call init() first.");
        }
        if (this.notifications != null) {
            return;
        }
        int i = this.n;
        this.notifications = new List[i + 1];
        this.errors = new List[i + 1];
        int i2 = 0;
        while (true) {
            List[] listArr = this.notifications;
            if (i2 >= listArr.length) {
                checkSignatures();
                checkNameConstraints();
                checkPathLength();
                checkPolicy();
                checkCriticalExtensions();
                return;
            }
            listArr[i2] = new ArrayList();
            this.errors[i2] = new ArrayList();
            i2++;
        }
    }

    protected Vector getCRLDistUrls(CRLDistPoint cRLDistPoint) {
        Vector vector = new Vector();
        if (cRLDistPoint != null) {
            for (DistributionPoint distributionPoint : cRLDistPoint.getDistributionPoints()) {
                DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                if (distributionPoint2.getType() == 0) {
                    GeneralName[] names = GeneralNames.getInstance(distributionPoint2.getName()).getNames();
                    for (int i = 0; i < names.length; i++) {
                        if (names[i].getTagNo() == 6) {
                            vector.add(((ASN1IA5String) names[i].getName()).getString());
                        }
                    }
                }
            }
        }
        return vector;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getCertPathSize() {
        return this.n;
    }

    public List getErrors(int i) {
        doChecks();
        return this.errors[i + 1];
    }

    public List[] getErrors() {
        doChecks();
        return this.errors;
    }

    public List getNotifications(int i) {
        doChecks();
        return this.notifications[i + 1];
    }

    public List[] getNotifications() {
        doChecks();
        return this.notifications;
    }

    protected Vector getOCSPUrls(AuthorityInformationAccess authorityInformationAccess) {
        Vector vector = new Vector();
        if (authorityInformationAccess != null) {
            AccessDescription[] accessDescriptions = authorityInformationAccess.getAccessDescriptions();
            for (int i = 0; i < accessDescriptions.length; i++) {
                if (accessDescriptions[i].getAccessMethod().equals((ASN1Primitive) AccessDescription.id_ad_ocsp)) {
                    GeneralName accessLocation = accessDescriptions[i].getAccessLocation();
                    if (accessLocation.getTagNo() == 6) {
                        vector.add(((ASN1IA5String) accessLocation.getName()).getString());
                    }
                }
            }
        }
        return vector;
    }

    public PolicyNode getPolicyTree() {
        doChecks();
        return this.policyTree;
    }

    public PublicKey getSubjectPublicKey() {
        doChecks();
        return this.subjectPublicKey;
    }

    public TrustAnchor getTrustAnchor() {
        doChecks();
        return this.trustAnchor;
    }

    protected Collection getTrustAnchors(X509Certificate x509Certificate, Set set) throws CertPathReviewerException {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            byte[] extensionValue = x509Certificate.getExtensionValue(Extension.authorityKeyIdentifier.getId());
            if (extensionValue != null) {
                AuthorityKeyIdentifier authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1Primitive.fromByteArray(((ASN1OctetString) ASN1Primitive.fromByteArray(extensionValue)).getOctets()));
                if (authorityKeyIdentifier.getAuthorityCertSerialNumber() != null) {
                    x509CertSelector.setSerialNumber(authorityKeyIdentifier.getAuthorityCertSerialNumber());
                } else {
                    byte[] keyIdentifier = authorityKeyIdentifier.getKeyIdentifier();
                    if (keyIdentifier != null) {
                        x509CertSelector.setSubjectKeyIdentifier(new DEROctetString(keyIdentifier).getEncoded());
                    }
                }
            }
            while (it.hasNext()) {
                TrustAnchor trustAnchor = (TrustAnchor) it.next();
                if (trustAnchor.getTrustedCert() != null) {
                    if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                        arrayList.add(trustAnchor);
                    }
                } else if (trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null && getEncodedIssuerPrincipal(x509Certificate).equals(new X500Principal(trustAnchor.getCAName()))) {
                    arrayList.add(trustAnchor);
                }
            }
            return arrayList;
        } catch (IOException unused) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustAnchorIssuerError"));
        }
    }

    public void init(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        if (this.initialized) {
            throw new IllegalStateException("object is already initialized!");
        }
        this.initialized = true;
        if (certPath == null) {
            throw new NullPointerException("certPath was null");
        }
        List<? extends Certificate> certificates = certPath.getCertificates();
        if (certificates.size() != 1) {
            HashSet hashSet = new HashSet();
            Iterator<TrustAnchor> it = pKIXParameters.getTrustAnchors().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getTrustedCert());
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != certificates.size(); i++) {
                if (!hashSet.contains(certificates.get(i))) {
                    arrayList.add(certificates.get(i));
                }
            }
            try {
                this.certPath = CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME).generateCertPath(arrayList);
                this.certs = arrayList;
            } catch (GeneralSecurityException unused) {
                throw new IllegalStateException("unable to rebuild certpath");
            }
        } else {
            this.certPath = certPath;
            this.certs = certPath.getCertificates();
        }
        this.n = this.certs.size();
        if (this.certs.isEmpty()) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.emptyCertPath"));
        }
        this.pkixParams = (PKIXParameters) pKIXParameters.clone();
        Date date = new Date();
        this.currentDate = date;
        this.validDate = getValidityDate(this.pkixParams, date);
        this.notifications = null;
        this.errors = null;
        this.trustAnchor = null;
        this.subjectPublicKey = null;
        this.policyTree = null;
    }

    public boolean isValidCertPath() {
        doChecks();
        int i = 0;
        while (true) {
            List[] listArr = this.errors;
            if (i >= listArr.length) {
                return true;
            }
            if (!listArr[i].isEmpty()) {
                return false;
            }
            i++;
        }
    }
}
