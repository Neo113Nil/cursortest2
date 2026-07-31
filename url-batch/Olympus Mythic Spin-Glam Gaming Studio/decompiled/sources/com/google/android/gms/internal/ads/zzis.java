package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzis extends zzhk {
    private final byte[] zza;
    private final DatagramPacket zzb;

    @Nullable
    private Uri zzc;

    @Nullable
    private DatagramSocket zzd;

    @Nullable
    private MulticastSocket zze;

    @Nullable
    private InetAddress zzf;
    private boolean zzg;
    private int zzh;

    public zzis() {
        throw null;
    }

    public zzis(int i) {
        super(true);
        byte[] bArr = new byte[2000];
        this.zza = bArr;
        this.zzb = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws zzir {
        if (i2 == 0) {
            return 0;
        }
        if (this.zzh == 0) {
            try {
                DatagramSocket datagramSocket = this.zzd;
                if (datagramSocket == null) {
                    throw null;
                }
                DatagramPacket datagramPacket = this.zzb;
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.zzh = length;
                zzh(length);
            } catch (SocketTimeoutException e) {
                throw new zzir(e, 2002);
            } catch (IOException e2) {
                throw new zzir(e2, 2001);
            }
        }
        int length2 = this.zzb.getLength();
        int i3 = this.zzh;
        int min = Math.min(i3, i2);
        System.arraycopy(this.zza, length2 - i3, bArr, i, min);
        this.zzh -= min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final long zzb(zzhw zzhwVar) throws zzir {
        Uri uri = zzhwVar.zza;
        this.zzc = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.zzc.getPort();
        zzf(zzhwVar);
        try {
            this.zzf = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.zzf, port);
            if (this.zzf.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.zze = multicastSocket;
                multicastSocket.joinGroup(this.zzf);
                this.zzd = this.zze;
            } else {
                this.zzd = new DatagramSocket(inetSocketAddress);
            }
            this.zzd.setSoTimeout(8000);
            this.zzg = true;
            zzg(zzhwVar);
            return -1L;
        } catch (IOException e) {
            throw new zzir(e, 2001);
        } catch (SecurityException e2) {
            throw new zzir(e2, 2006);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    @Nullable
    public final Uri zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() {
        InetAddress inetAddress;
        this.zzc = null;
        MulticastSocket multicastSocket = this.zze;
        if (multicastSocket != null) {
            try {
                inetAddress = this.zzf;
            } catch (IOException unused) {
            }
            if (inetAddress == null) {
                throw null;
            }
            multicastSocket.leaveGroup(inetAddress);
            this.zze = null;
        }
        DatagramSocket datagramSocket = this.zzd;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.zzd = null;
        }
        this.zzf = null;
        this.zzh = 0;
        if (this.zzg) {
            this.zzg = false;
            zzi();
        }
    }
}
