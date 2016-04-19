LOCAL_PATH:= $(call my-dir)  
include $(CLEAR_VARS)  
LOCAL_MODULE := JNITest  
LOCAL_SRC_FILES:= com_example_billyjni_MainActivity.c 
include $(BUILD_SHARED_LIBRARY)