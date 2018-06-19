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
import com.kl.instasec.base.BaseFragment;

import lombok.Getter;
import lombok.Setter;

#parse("File Header.java")
public class ${NAME} extends BaseFragment {

    @Getter
    @Setter
    private ${NAME}ViewModel viewModel;
    private ${NAME}Binding b;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        b = DataBindingUtil.inflate(inflater, R.layout.${toDash}, container, false);
        return b.getRoot(); 
    }
}