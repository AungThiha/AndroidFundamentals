package thiha.aung.android.lifecycle

import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CancellationSignal
import android.os.PersistableBundle
import android.util.AttributeSet
import android.view.ActionMode
import android.view.Menu
import android.view.View
import android.view.WindowManager
import androidx.fragment.app.Fragment
import timber.log.Timber
import java.util.function.Consumer

class LifecycleHomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Timber.d("onCreate(savedInstanceState: Bundle?)")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle_home)
    }

    override fun onStart() {
        Timber.d("onStart")
        super.onStart()
    }

    override fun onResume() {
        Timber.d("onResume")
        super.onResume()
    }

    override fun onPause() {
        Timber.d("onPause")
        super.onPause()
    }

    override fun onStop() {
        Timber.d("onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Timber.d("onDestroy")
        super.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        Timber.d("onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle)")
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Timber.d("onRestoreInstanceState(savedInstanceState: Bundle)")
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        Timber.d("onCreateOptionsMenu(menu: Menu?): Boolean")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        Timber.d("onCreateView(name: String, context: Context, attrs: AttributeSet): View?")
        return super.onCreateView(name, context, attrs)
    }

    override fun onAttachedToWindow() {
        Timber.d("onAttachedToWindow")
        super.onAttachedToWindow()
    }

    override fun onDetachedFromWindow() {
        Timber.d("onDetachedFromWindow")
        super.onDetachedFromWindow()
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        Timber.d("onPrepareOptionsMenu(menu: Menu?): Boolean ")
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        Timber.d("onPrepareOptionsMenu(savedInstanceState: Bundle?, persistentState: PersistableBundle?)")
        super.onPostCreate(savedInstanceState, persistentState)
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        Timber.d("onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?)")
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onRestart() {
        Timber.d("onRestart")
        super.onRestart()
    }

    override fun onPostResume() {
        Timber.d("onPostResume")
        super.onPostResume()
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        Timber.d("onPostCreate(savedInstanceState: Bundle?)")
        super.onPostCreate(savedInstanceState)
    }

    override fun onNewIntent(intent: Intent?) {
        Timber.d("onNewIntent")
        super.onNewIntent(intent)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Timber.d("onSaveInstanceState(outState: Bundle)")
        super.onSaveInstanceState(outState)
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
    }

    override fun onProvideReferrer(): Uri {
        return super.onProvideReferrer()
    }

    override fun onTopResumedActivityChanged(isTopResumedActivity: Boolean) {
        super.onTopResumedActivityChanged(isTopResumedActivity)
    }

    override fun onActionModeFinished(mode: ActionMode?) {
        super.onActionModeFinished(mode)
    }

    override fun onActionModeStarted(mode: ActionMode?) {
        super.onActionModeStarted(mode)
    }

    override fun onActivityReenter(resultCode: Int, data: Intent?) {
        super.onActivityReenter(resultCode, data)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }

    override fun onApplyThemeResource(theme: Resources.Theme?, resid: Int, first: Boolean) {
        super.onApplyThemeResource(theme, resid, first)
    }

    override fun onCreateDescription(): CharSequence? {
        return super.onCreateDescription()
    }

    override fun onEnterAnimationComplete() {
        super.onEnterAnimationComplete()
    }

    override fun onUserInteraction() {
        super.onUserInteraction()
    }

    override fun onUserLeaveHint() {
        super.onUserLeaveHint()
    }

    override fun onWindowAttributesChanged(params: WindowManager.LayoutParams?) {
        super.onWindowAttributesChanged(params)
    }

    override fun onWindowStartingActionMode(callback: ActionMode.Callback?): ActionMode? {
        return super.onWindowStartingActionMode(callback)
    }

    override fun onWindowStartingActionMode(
        callback: ActionMode.Callback?,
        type: Int
    ): ActionMode? {
        return super.onWindowStartingActionMode(callback, type)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
    }

    override fun onWindowStartingSupportActionMode(callback: androidx.appcompat.view.ActionMode.Callback): androidx.appcompat.view.ActionMode? {
        return super.onWindowStartingSupportActionMode(callback)
    }

    override fun onPointerCaptureChanged(hasCapture: Boolean) {
        super.onPointerCaptureChanged(hasCapture)
    }

    override fun onAttachFragment(fragment: Fragment) {
        super.onAttachFragment(fragment)
    }

    override fun onContentChanged() {
        super.onContentChanged()
    }

    override fun onTitleChanged(title: CharSequence?, color: Int) {
        super.onTitleChanged(title, color)
    }

    override fun onStateNotSaved() {
        super.onStateNotSaved()
    }

    override fun onPerformDirectAction(
        actionId: String,
        arguments: Bundle,
        cancellationSignal: CancellationSignal,
        resultListener: Consumer<Bundle>
    ) {
        super.onPerformDirectAction(actionId, arguments, cancellationSignal, resultListener)
    }

    // There are actually many more

}