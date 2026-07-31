package com.google.android.gms.internal.p002firebaseauthapi;

import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.stats.CodePackage;
import com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zznd implements zzbx {
    private static final Object zza = new Object();

    /* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
    public static final class zza {
        public zza() {
            zznd.zza();
        }
    }

    static /* synthetic */ boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbx
    public final zzba zza(String str) throws GeneralSecurityException {
        zznb zznbVar;
        try {
            synchronized (zza) {
                zznbVar = new zznb(zzaai.zza(AndroidKeystoreKmsClient.PREFIX, str));
                byte[] zza2 = zzqd.zza(10);
                byte[] bArr = new byte[0];
                if (!Arrays.equals(zza2, zznbVar.zza(zznbVar.zzb(zza2, bArr), bArr))) {
                    throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                }
            }
            return zznbVar;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public zznd() throws GeneralSecurityException {
        this(new zza());
    }

    private zznd(zza zzaVar) {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbx
    public final boolean zzb(String str) {
        return str.toLowerCase(Locale.US).startsWith(AndroidKeystoreKmsClient.PREFIX);
    }

    static boolean zzc(String str) throws GeneralSecurityException {
        synchronized (zza) {
            String zza2 = zzaai.zza(AndroidKeystoreKmsClient.PREFIX, str);
            if (zzmz.zzb(zza2)) {
                return false;
            }
            KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(zza2, 3).setKeySize(256).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").build();
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(build);
            keyGenerator.generateKey();
            return true;
        }
    }
}
