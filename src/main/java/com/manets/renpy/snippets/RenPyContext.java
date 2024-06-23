package com.manets.renpy.snippets;
import com.intellij.codeInsight.template.TemplateActionContext;
import com.intellij.codeInsight.template.TemplateContextType;
import com.intellij.openapi.diagnostic.Logger;
import org.jetbrains.annotations.NotNull;

final public class RenPyContext extends TemplateContextType {

    public RenPyContext() {
        super("RenPy");
    }

    @Override
    public boolean isInContext(@NotNull TemplateActionContext templateActionContext) {
        return templateActionContext.getFile().getName().endsWith(".rpy");
    }
}
