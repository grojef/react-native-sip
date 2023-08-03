/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class AudioMedia extends Media {
  private transient long swigCPtr;

  protected AudioMedia(long cPtr, boolean cMemoryOwn) {
    super(pjsua2JNI.AudioMedia_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AudioMedia obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_AudioMedia(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ConfPortInfo getPortInfo() throws java.lang.Exception {
    return new ConfPortInfo(pjsua2JNI.AudioMedia_getPortInfo(swigCPtr, this), true);
  }

  public int getPortId() {
    return pjsua2JNI.AudioMedia_getPortId(swigCPtr, this);
  }

  public static ConfPortInfo getPortInfoFromId(int port_id) throws java.lang.Exception {
    return new ConfPortInfo(pjsua2JNI.AudioMedia_getPortInfoFromId(port_id), true);
  }

  public void startTransmit(AudioMedia sink) throws java.lang.Exception {
    pjsua2JNI.AudioMedia_startTransmit(swigCPtr, this, AudioMedia.getCPtr(sink), sink);
  }

  public void startTransmit2(AudioMedia sink, AudioMediaTransmitParam param) throws java.lang.Exception {
    pjsua2JNI.AudioMedia_startTransmit2(swigCPtr, this, AudioMedia.getCPtr(sink), sink, AudioMediaTransmitParam.getCPtr(param), param);
  }

  public void stopTransmit(AudioMedia sink) throws java.lang.Exception {
    pjsua2JNI.AudioMedia_stopTransmit(swigCPtr, this, AudioMedia.getCPtr(sink), sink);
  }

  public void adjustRxLevel(float level) throws java.lang.Exception {
    pjsua2JNI.AudioMedia_adjustRxLevel(swigCPtr, this, level);
  }

  public void adjustTxLevel(float level) throws java.lang.Exception {
    pjsua2JNI.AudioMedia_adjustTxLevel(swigCPtr, this, level);
  }

  public long getRxLevel() throws java.lang.Exception {
    return pjsua2JNI.AudioMedia_getRxLevel(swigCPtr, this);
  }

  public long getTxLevel() throws java.lang.Exception {
    return pjsua2JNI.AudioMedia_getTxLevel(swigCPtr, this);
  }

  public static AudioMedia typecastFromMedia(Media media) {
    long cPtr = pjsua2JNI.AudioMedia_typecastFromMedia(Media.getCPtr(media), media);
    return (cPtr == 0) ? null : new AudioMedia(cPtr, false);
  }

}
