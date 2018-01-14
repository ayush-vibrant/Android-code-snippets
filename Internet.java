public boolean isNetworkAvailable(Context context) {
    final ConnectivityManager connectivityManager = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE));
    return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
}

// Use following Permission
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
