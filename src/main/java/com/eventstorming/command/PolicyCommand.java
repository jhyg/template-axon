forEach: Policy
fileName: {{namePascalCase}}Command.java
path: {{boundedContext.name}}/{{{options.packagePath}}}/command
---
package {{options.package}}.command;

import org.axonframework.modelling.command.TargetAggregateIdentifier;


import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class {{namePascalCase}}Command {

    {{#aggregate.aggregateRoot.fieldDescriptors}}
    {{#isKey}}
    @TargetAggregateIdentifier
    {{/isKey}}
    private {{className}} {{nameCamelCase}};
    {{/aggregate.aggregateRoot.fieldDescriptors}}

}
