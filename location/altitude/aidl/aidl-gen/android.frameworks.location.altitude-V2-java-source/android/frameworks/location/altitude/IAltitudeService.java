/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/frameworks/hardware/interfaces/location/altitude/aidl/aidl-gen/android.frameworks.location.altitude-V2-java-source -I/home/shadichy/Documents/bliss/los-21/frameworks/hardware/interfaces/location/altitude/aidl/aidl_api/android.frameworks.location.altitude/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 /home/shadichy/Documents/bliss/los-21/frameworks/hardware/interfaces/location/altitude/aidl/aidl_api/android.frameworks.location.altitude/2/android/frameworks/location/altitude/IAltitudeService.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.frameworks.location.altitude;
/** @hide */
public interface IAltitudeService extends android.os.IInterface
{
  /** Default implementation for IAltitudeService. */
  public static class Default implements android.frameworks.location.altitude.IAltitudeService
  {
    @Override public android.frameworks.location.altitude.AddMslAltitudeToLocationResponse addMslAltitudeToLocation(android.frameworks.location.altitude.AddMslAltitudeToLocationRequest request) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.frameworks.location.altitude.GetGeoidHeightResponse getGeoidHeight(android.frameworks.location.altitude.GetGeoidHeightRequest request) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.frameworks.location.altitude.IAltitudeService
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.frameworks.location.altitude.IAltitudeService interface,
     * generating a proxy if needed.
     */
    public static android.frameworks.location.altitude.IAltitudeService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.frameworks.location.altitude.IAltitudeService))) {
        return ((android.frameworks.location.altitude.IAltitudeService)iin);
      }
      return new android.frameworks.location.altitude.IAltitudeService.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(DESCRIPTOR);
      }
      switch (code)
      {
        case TRANSACTION_addMslAltitudeToLocation:
        {
          android.frameworks.location.altitude.AddMslAltitudeToLocationRequest _arg0;
          _arg0 = data.readTypedObject(android.frameworks.location.altitude.AddMslAltitudeToLocationRequest.CREATOR);
          data.enforceNoDataAvail();
          android.frameworks.location.altitude.AddMslAltitudeToLocationResponse _result = this.addMslAltitudeToLocation(_arg0);
          reply.writeNoException();
          reply.writeTypedObject(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_getGeoidHeight:
        {
          android.frameworks.location.altitude.GetGeoidHeightRequest _arg0;
          _arg0 = data.readTypedObject(android.frameworks.location.altitude.GetGeoidHeightRequest.CREATOR);
          data.enforceNoDataAvail();
          android.frameworks.location.altitude.GetGeoidHeightResponse _result = this.getGeoidHeight(_arg0);
          reply.writeNoException();
          reply.writeTypedObject(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.frameworks.location.altitude.IAltitudeService
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public final java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public android.frameworks.location.altitude.AddMslAltitudeToLocationResponse addMslAltitudeToLocation(android.frameworks.location.altitude.AddMslAltitudeToLocationRequest request) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.frameworks.location.altitude.AddMslAltitudeToLocationResponse _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(request, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_addMslAltitudeToLocation, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readTypedObject(android.frameworks.location.altitude.AddMslAltitudeToLocationResponse.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.frameworks.location.altitude.GetGeoidHeightResponse getGeoidHeight(android.frameworks.location.altitude.GetGeoidHeightRequest request) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.frameworks.location.altitude.GetGeoidHeightResponse _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(request, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getGeoidHeight, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readTypedObject(android.frameworks.location.altitude.GetGeoidHeightResponse.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_addMslAltitudeToLocation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getGeoidHeight = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$frameworks$location$altitude$IAltitudeService".replace('$', '.');
  public android.frameworks.location.altitude.AddMslAltitudeToLocationResponse addMslAltitudeToLocation(android.frameworks.location.altitude.AddMslAltitudeToLocationRequest request) throws android.os.RemoteException;
  public android.frameworks.location.altitude.GetGeoidHeightResponse getGeoidHeight(android.frameworks.location.altitude.GetGeoidHeightRequest request) throws android.os.RemoteException;
}
