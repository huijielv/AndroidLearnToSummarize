package com.example.administrator.androidlearnproject;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;


public class MainActivity extends Activity {

    private static final int[] NUMBERS = {49, 38, 65, 97, 76, 13, 27, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        insertSort (NUMBERS);


//        TreeNode  root = new TreeNode(1, "A");
//
//        TreeNode nodeB = new TreeNode(2, "B");
//        TreeNode nodeC = new TreeNode(3, "C");
//        TreeNode nodeD = new TreeNode(4, "D");
//        TreeNode nodeE = new TreeNode(5, "E");
//        TreeNode nodeF = new TreeNode(6, "F");
//        root.leftChild = nodeB;
//        root.rightChild = nodeC;
//        nodeB.leftChild = nodeD;
//        nodeB.rightChild = nodeE;
//        nodeC.rightChild = nodeF;
//
//        midOrder (root);
    }

    public void midOrder (TreeNode node ){
        if (node!=null){
            return;
        }else {
            midOrder(node.leftChild);
             Log.d("5555","midOrder data:"+node.getData());
            midOrder(node.rightChild);
        }
    }

//    public static final int REQUEST_PICK_IMAGE = 10011;
//    public static final int REQUEST_KITKAT_PICK_IMAGE = 10012;
//
//    public void pickFromGallery(View v) {
//        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
//            startActivityForResult(new Intent(Intent.ACTION_GET_CONTENT).setType("image/*"),
//                    REQUEST_PICK_IMAGE);
//        } else {
//            Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
//            intent.addCategory(Intent.CATEGORY_OPENABLE);
//            intent.setType("image/*");
//            startActivityForResult(intent, REQUEST_KITKAT_PICK_IMAGE);
//        }
//    }
//
//    @Override
//    public void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (resultCode == Activity.RESULT_OK) {
//            switch (requestCode) {
//
//                case REQUEST_PICK_IMAGE:
//                    if (data != null) {
//                        Uri uri = data.getData();
//                        compressImage(uri);
//
//                    } else {
//                        Log.e("======", "========图片为空======");
//                    }
//                    break;
//                case REQUEST_KITKAT_PICK_IMAGE:
//                    if (data != null) {
//                        Uri uri = ensureUriPermission(this, data);
//                        compressImage(uri);
//                    } else {
//                        Log.e("======", "====-----==图片为空======");
//                    }
//                    break;
//            }
//        }
//    }
//
//    @SuppressWarnings("ResourceType")
//    @TargetApi(Build.VERSION_CODES.KITKAT)
//    public static Uri ensureUriPermission(Context context, Intent intent) {
//        Uri uri = intent.getData();
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//            final int takeFlags = intent.getFlags() & Intent.FLAG_GRANT_READ_URI_PERMISSION;
//            context.getContentResolver().takePersistableUriPermission(uri, takeFlags);
//        }
//        return uri;
//    }
//
//
//    public void compressImage(Uri uri) {
//        Log.e("===compressImage===", "====开始====uri==" + uri.getPath());
//        try {
//            Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);File saveFile1 = new File(getExternalCacheDir(), "jni终极压缩1.jpg");
//
////           NativeUtil.jniUltimateCompress(bitmap, saveFile1.getAbsolutePath());
////
////            File saveFile2 = new File(getExternalCacheDir(), "混合终极方法1.jpg");
////            NativeUtil.mixCompress(bitmap, saveFile2.getAbsolutePath());
////
//           File saveFile3 = new File(getExternalCacheDir(), "质量压缩1.jpg");
////           NativeUtil.qualityCompress(bitmap,saveFile3);
////
////            File saveFile4 = new File(getExternalCacheDir(), "尺寸压缩1.jpg");
////            NativeUtil.sizeCompress(bitmap,saveFile4);
//
//            File saveFile5 = new File(getExternalCacheDir(), "采样率压缩1.jpg");
//            File f = new File("/storage/sdcard0/DCIM/Camera/IMG_20161130_200251.jpg");
//            if(f.exists()){
////                NativeUtil.samplingRateCompress(f.getAbsolutePath(),saveFile5);
//            }else{
//                Log.e("===compressImage===", "采样率压缩找不到这个代码里面写死的图片哦~~~~");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }


    public class TreeNode {
        private int index;
        private String data;
        private TreeNode leftChild;
        private TreeNode rightChild;


        public int getIndex() {
            return index;
        }


        public void setIndex(int index) {
            this.index = index;
        }


        public String getData() {
            return data;
        }


        public void setData(String data) {
            this.data = data;
        }


        public TreeNode(int index,String data){
            this.index = index;
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }

    }

//    public void createBinaryTree(){
//
//         TreeNode  root = new TreeNode(1, "A");
//
//        TreeNode nodeB = new TreeNode(2, "B");
//        TreeNode nodeC = new TreeNode(3, "C");
//        TreeNode nodeD = new TreeNode(4, "D");
//        TreeNode nodeE = new TreeNode(5, "E");
//        TreeNode nodeF = new TreeNode(6, "F");
//        root.leftChild = nodeB;
//        root.rightChild = nodeC;
//        nodeB.leftChild = nodeD;
//        nodeB.rightChild = nodeE;
//        nodeC.rightChild = nodeF;
//    }
     // 快速排序
    public static void insertSort( int [] array){
//        for ( int i=1 ;i<array.length ;i++){
//            int temp =array[i];
//            int j= i-1;
//            for ( ;j>=0&&array[j]>temp;j--){
//                array[j+1]=array[j];
//            }
//            array[j+1]=temp;
//        }
//
//        System.out.println(Arrays.toString(array) + " insertSort");

        for ( int i=0 ;i<array.length;i++){
            int temp =array[i];
            int j = i-1 ;
            for ( ;j>=0&&array[j]>temp;j--){
                array[j+1]=array[j];
            }
            array[j+1] =temp ;
        }
        System.out.println(Arrays.toString(array) + " insertSort");
    }



}
