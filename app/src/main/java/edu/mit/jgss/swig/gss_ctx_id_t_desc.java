/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.mit.jgss.swig;

public class gss_ctx_id_t_desc {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected gss_ctx_id_t_desc(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(gss_ctx_id_t_desc obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gsswrapperJNI.delete_gss_ctx_id_t_desc(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setLoopback(gss_ctx_id_t_desc value) {
    gsswrapperJNI.gss_ctx_id_t_desc_loopback_set(swigCPtr, this, gss_ctx_id_t_desc.getCPtr(value), value);
  }

  public gss_ctx_id_t_desc getLoopback() {
    long cPtr = gsswrapperJNI.gss_ctx_id_t_desc_loopback_get(swigCPtr, this);
    return (cPtr == 0) ? null : new gss_ctx_id_t_desc(cPtr, false);
  }

  public void setMech_type(gss_OID_desc value) {
    gsswrapperJNI.gss_ctx_id_t_desc_mech_type_set(swigCPtr, this, gss_OID_desc.getCPtr(value), value);
  }

  public gss_OID_desc getMech_type() {
    long cPtr = gsswrapperJNI.gss_ctx_id_t_desc_mech_type_get(swigCPtr, this);
    return (cPtr == 0) ? null : new gss_OID_desc(cPtr, false);
  }

  public void setInternal_ctx_id(gss_ctx_id_t_desc value) {
    gsswrapperJNI.gss_ctx_id_t_desc_internal_ctx_id_set(swigCPtr, this, gss_ctx_id_t_desc.getCPtr(value), value);
  }

  public gss_ctx_id_t_desc getInternal_ctx_id() {
    long cPtr = gsswrapperJNI.gss_ctx_id_t_desc_internal_ctx_id_get(swigCPtr, this);
    return (cPtr == 0) ? null : new gss_ctx_id_t_desc(cPtr, false);
  }

  public gss_ctx_id_t_desc() {
    this(gsswrapperJNI.new_gss_ctx_id_t_desc(), true);
  }

}
