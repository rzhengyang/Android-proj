    #include <jni.h>
    #include <string.h>
    #include "com_example_billyjni_MainActivity.h"


   JNIEXPORT jstring JNICALL Java_com_example_billyjni_MainActivity_GetReply
 (JNIEnv *env, jobject obj){
    return(*env)->NewStringUTF(env,(char*)"Hello,JNITest");
    }
