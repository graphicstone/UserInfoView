package com.nullbyte.userinfoview

import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.view.View
import androidx.appcompat.content.res.AppCompatResources
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.user_info_view_layout.view.*

class UserInfoView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) :
    ConstraintLayout(context, attrs, defStyleAttr) {

    init {
        init(attrs)
    }

    private fun init(attrs: AttributeSet?) {
        View.inflate(context, R.layout.user_info_view_layout, this)

        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.UserInfoView)
        try {
            val title = typedArray.getString(R.styleable.UserInfoView_title)
            val titleTextColor = typedArray.getColor(R.styleable.UserInfoView_titleTextColor, ContextCompat.getColor(context, R.color.colorBlack))
            val titleTextSize = typedArray.getDimension(R.styleable.UserInfoView_titleTextSize, resources.getDimension(R.dimen.sp_20))
            val subTitle = typedArray.getString(R.styleable.UserInfoView_subtitle)
            val subTitleTextColor = typedArray.getColor(R.styleable.UserInfoView_subtitleTextColor, ContextCompat.getColor(context, R.color.colorBlack))
            val subTitleTextSize = typedArray.getDimension(R.styleable.UserInfoView_subtitleTextSize, resources.getDimension(R.dimen.sp_18))
            val tag = typedArray.getString(R.styleable.UserInfoView_tag)
            val tagTextColor = typedArray.getColor(R.styleable.UserInfoView_tagTextColor, ContextCompat.getColor(context, R.color.colorBlack))
            val tagTextSize = typedArray.getDimension(R.styleable.UserInfoView_tagTextSize, resources.getDimension(R.dimen.sp_10))
            val backgroundColor = typedArray.getColor(R.styleable.UserInfoView_backgroundColor, ContextCompat.getColor(context, R.color.colorPrimary))
            val cornerRadius = typedArray.getDimension(R.styleable.UserInfoView_cornerRadius, resources.getDimension(R.dimen.dp_16))
            val image = typedArray.getResourceId(R.styleable.UserInfoView_image, 0)

            if (image != 0) {
                val drawable = AppCompatResources.getDrawable(context, image)
                iv_avatar.setImageDrawable(drawable)
            }
            tv_title.text = title
            tv_title.setTextColor(titleTextColor)
            tv_title.setTextSize(TypedValue.COMPLEX_UNIT_PX, titleTextSize)
            tv_subtitle.text = subTitle
            tv_subtitle.setTextColor(subTitleTextColor)
            tv_subtitle.setTextSize(TypedValue.COMPLEX_UNIT_PX, subTitleTextSize)
            tv_tag.text = tag
            tv_tag.setTextColor(tagTextColor)
            tv_tag.setTextSize(TypedValue.COMPLEX_UNIT_PX, tagTextSize)
            card_view.radius = cornerRadius
            card_view.setCardBackgroundColor(backgroundColor)
        } finally {
            typedArray.recycle()
        }
    }
}