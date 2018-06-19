#set( $regex = "([a-z])([A-Z]+)")
#set( $replacement = "$1_$2")
#set( $toDash = $NAME.replaceAll($regex, $replacement).toLowerCase())

package ${PACKAGE_NAME};

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kl.instasec.R;
import com.kl.instasec.base.BaseWidget;

import lombok.Getter;
import lombok.Setter;

#parse("File Header.java")
public class ${NAME} extends BaseWidget {

  private ${NAME}Binding b;

  public ${NAME}(Context context) {
        super(context);
        init(context, null);
    }

    public ${NAME}(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public ${NAME}(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, @Nullable AttributeSet attrs) {
        b = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.${toDash}, this, true);
    }
    
}